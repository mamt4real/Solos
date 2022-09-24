package Solos;

import java.util.ArrayList;
import java.util.Collections;
/*this program takes a string argument
and return the longest 
palindromic substring
of the argument
*/
public class S005 {

  public static void main(String[] args){
    String str = "babadlevelsmamabab";
    String str2 = "cadrsa";
    ArrayList<String> pals = getPalins(str);
    if(pals.isEmpty())
      System.out.println("oops no substrings that are palindromes!!");
    else{
       Collections.sort(pals);
       System.out.println(pals);
       String longest = getLong(pals);
       System.out.println(longest);
    }
    
  }
  
  static ArrayList<String> getPalins(String s){
    ArrayList<String> pals = new ArrayList<String>();
    for(int i = 0;i<s.length();i++){
       char fst = s.charAt(i);
       for(int j=i+1;j<s.length();j++)
         if(fst == s.charAt(j))
           pals.add(s.substring(i,j+1));
    }
    pals = filterPals(pals);
    return pals;
  }
  static ArrayList<String> filterPals(ArrayList<String> lst){
    ArrayList<String> fltrd = new ArrayList<String>();
    for(String s: lst)
      if(s.equals(reverse(s)))
         fltrd.add(s);
    return fltrd;
  }
  static String getLong(ArrayList<String> lst){
    String str = "";
    for(String s: lst)
      if(s.length()>str.length())
         str = s;
    return str;
  }
  static String reverse(String s){
    return (new StringBuffer(s)).reverse().toString();
  }

}
