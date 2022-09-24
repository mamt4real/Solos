package Solos;
import java.util.Scanner;
/* The method countUniques(a)
takes in a sorted array a, and
returns the number of unique elements
l of the array as its length with the
array modified such that the first
l elements are the unique ones
*/

public class S018 {

  public static void main(String[] args){
    int[][] exmp = {{1,1,2},{0,0,1,1,1,2,2,3,3,4},{3,4,5,5,5,7,7,9}};
    for(int[] a: exmp){
      int l = countUnique(a);
      System.out.printf("length = %d:",l);
      for(int i=0;i<l;i++)
        System.out.print(" " + a[i]);
      System.out.println();
    }
    swap();

  }
  static int countUnique(int[] a){
    int l = 1;
    for(int i = 1;i<a.length;i++)
      if(a[i] != a[i-1])
        a[l++] = a[i];
    return l;
  }
  static void swap(){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first no: ");
    int fst = in.nextInt();
    System.out.print("Enter the second no: ");
    int scnd = in.nextInt();
    System.out.printf("The first no is: %d%nThe second number is: %d %n",fst,scnd); 
    fst += scnd;
    scnd = fst - scnd;
    fst -= scnd;
    System.out.println("After swapping");
    System.out.printf("The first no is: %d%nThe second number is: %d ",fst,scnd);
    in.close();
  }

}
