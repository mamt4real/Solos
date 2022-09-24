package Solos;
/*This program manipulates
 *a string into a zigzag 
 *pattern base on inputed
 *row given..
 *default string is
 *PAYPALISHIRING
 */
import java.util.Scanner;
import java.util.Arrays;
public class S006 {

  public static void main(String[] args){
    String sr =  "";
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int n = in.nextInt();
    if(s.equals(""))
       s = "PAYPALISHIRING";
    String rows[] = getRows(s,n);
    System.out.println(Arrays.toString(rows));
    for(String r: rows)
       System.out.print(r);

  }
  static String[] getRows(String s,int n){
    String[] rows = new String[n];
    for(int i=0;i<rows.length;i++)
       rows[i] = "";
    int ind = 0,step = 1;
    for(int i=0;i<s.length();i++){
      rows[ind] += s.charAt(i);
      if(0>(ind+step) || (ind+step)==n)
        step *= -1;
      ind += step;
    }
    return rows;
  }

}
