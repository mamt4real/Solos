package Solos;
/*This class takes an integer n
and any of "()","{}" or "[]"
and return the possible valid
combinations of n times of the 
input parenthesis
*/
import java.util.ArrayList;

public class S016 {

  public static void main(String[] args) {
     String[] types = {"()","{}"};
     int[] exmpl = {2,3,4};
     for(int i= 0;i<2;i++)
        System.out.println(generate(types[i],exmpl[i]));
  }
  static ArrayList<String> generate(String type, int n){
    String s = "";
    for(int i = 0;i<n;i++)
       s += type;
    ArrayList<String> lst = new ArrayList<String>();
     return generate(lst,s,0,s.length());
  }
  static ArrayList<String> generate(ArrayList<String> res, String s,int st, int sp){
    if(st == sp){
      if(S015.isValid(s) && !res.contains(s))
         res.add(s);
    }
    for(int i = st;i<sp;i++){
      s = swap(s,st,i);
      generate(res,s,st+1,sp);
      s = swap(s,st,i);
    }
    return res;
  }
  static String swap(String s,int i,int j){
    char chrs[] = s.toCharArray();
    char temp = chrs[i];
    chrs[i] = chrs[j];
    chrs[j] = temp;
    String res = "";
    for(char c: chrs)
      res += c;
    return res;
  }

}
