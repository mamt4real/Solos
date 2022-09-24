package Solos;
/* this program takes a string s
and a pattern p and return
true if the pattern matches the whole
string and false otherwise
'.' can be any letter
'*' indicate 0 or more repetition of the preceding letter
*/

public class S008 {

  public static void main(String[] args){
  
    String[][] exmpls = {{"aa","a"},{"aa","a*"},{"ab",".*"},{"aab","c*a*b"},{"mississippi","mis*is*p*"},{"mallam","x*m.l*am"}};
    for(String[] eg: exmpls)
      System.out.println(match(eg[0],eg[1]));

  }
  
  static boolean match(String s, String p){
    int pi = 0;
    for(int i=0;i<s.length();i++){
      char sc = s.charAt(i);
      char pc = p.charAt(pi);
      if(sc == pc || pc == '.'){
        pi++;
        if(pi == p.length() && i < s.length() -1)
          return false;
        continue;
      }
      else if(pc == '*'){
        char ppc = p.charAt(pi-1);
        if(ppc == '.' || ppc == sc)
          continue;
        else if(pi < p.length() -1){
          if(sc == p.charAt(++pi)){
            pi++;
            continue;
          }
          else
            return false;
        }
        else
          return false;
      }
      else if(pc != sc && p.charAt(++pi) == '*'){
        i--;
        pi++;
        continue;
      }
      else
        return false;
    }
    return true;
  }

}
