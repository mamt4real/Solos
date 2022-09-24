package Solos;
import java.util.Scanner;
/*This program takes a string
and return the longest substring
with no repetitive characters
in it
*/
public class S003{

  public static void main(String[] args){
  
    Scanner in = new Scanner(System.in);
    char[] inp = in.nextLine().toCharArray();
    String sub = "";
    String subs = "";
    for(int i=0;i<inp.length;i++){
      if(sub.indexOf(inp[i]) == -1)
        sub += inp[i];
      else{
        subs += sub + " ";
        sub = inp[i] + "";
      }
    }
    String[] subarr = subs.split(" ");
    for(String s: subarr)
      if(s.length() > sub.length())
         sub = s;
    System.out.printf("max length: %d%nsubstring: %s",sub.length(),sub);

  }

}
