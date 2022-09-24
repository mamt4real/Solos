package Solos;
/*this class takes a string
containing digis b/w 2:9
and return the possible
combination of characters
obtain from a phone keypad
*/
import java.util.ArrayList;
public class S012 {

  public static void main(String[] args){
  
    String[] exmpls = {"1bc","234","23","78","567","923","624234"};
    for(String s: exmpls)
       System.out.println(getComb(s));

  }
  static boolean isValid(String s){
    for(char c: s.toCharArray())
      if(!(c >= '2' && c <= '9'))
         return false;
    return true;
  }
  static String getChars(char c){
    switch(c){
      case '2': return "abc";
      case '3': return "def";
      case '4': return "ghi";
      case '5': return "jkl";
      case '6': return "mno";
      case '7': return "pqrs";
      case '8': return "tuv";
      case '9': return "wxyz";
    }
    return "";
  }
  static  ArrayList<String> getComb(String digits){
    ArrayList<String> letters = new ArrayList<String>();
    if(!isValid(digits))
       return letters;
    for(char c: digits.toCharArray())
      letters.add(getChars(c));
    String s = letters.remove(0);
    ArrayList<String> combinations = new ArrayList<String>();
    for(char c: s.toCharArray())
       combinations.add(c + "");
    for(String str: letters)
       combinations = combine(combinations,str);
    return combinations;
  }
  static ArrayList<String> combine(ArrayList<String> lst,String val){
    ArrayList<String> res = new ArrayList<String>();
    for(String s: lst)
      for(char c: val.toCharArray())
         res.add(s + c);
    return res;
  }

}
