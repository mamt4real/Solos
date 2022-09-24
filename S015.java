package Solos;
/*This class takes in a string
containing sequence of brackets
"[({})]" and verify whether they
are correctly parenthesise
*/
import java.util.Stack;

public class S015 {

  public static void main(String[] args){
    String[] exmpls = {"()","()[]{}","(]","([)]","{[]}"};
    for(String s: exmpls)
      System.out.println(isValid(s));
  }
  
  static boolean isValid(String prn){
    String opens = "{([";
    Stack<Character> stck = new Stack<Character>();
    for(char c: prn.toCharArray()){
      if(opens.indexOf(c) != -1){
        stck.push(c);
      }
      else{
        if(stck.isEmpty())
           return false;
        char o = stck.pop();   
        if(!arePairs(o,c))
          return false;
      }
    }
    if(stck.isEmpty())
       return true;
    return false;
  }
  static boolean arePairs(char o,char cl){
    String in = "" + o + cl;
    return (in.equals("{}") || in.equals("()") || in.equals("[]"));
  }

}
