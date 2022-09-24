package Solos;

import java.util.ArrayList;


public class GenerateValidBrackets {

  public static void main(String[] args){
    
    int[] exmpl = {1,2,3,4,5};
    for(int x: exmpl)
      System.out.println(generate(x));

  }
  
  static String g(String p, int i){ 
    return p.substring(0,i) + "()" + p.substring(i);
  }
  
  static ArrayList<String> addOne(String p){
    ArrayList<String> res = new ArrayList<String>();
    for(int i = 0;i<p.length();i++)
      res.add(g(p,i));
    return res;
  } 
  static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
    for(String s : b)
      if(!a.contains(s))
         a.add(s);
    return a;
  }
  
  static ArrayList<String> generate(int n){
    ArrayList<String> res = new ArrayList<String>();
    if(n<1)
      return res;
    if(n == 1){
      res.add("()");
      return res;
    }
    ArrayList<String> tmp = generate(n-1);
    for(String s: tmp)
       res = merge(res,addOne(s));
    return res;
  }

}
