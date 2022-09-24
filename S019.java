package Solos;

/*The method removeEle(a,e) takes in
an array a and an element e of a
it returns the length l of a when
all instances of e are removed, with
a now modified so that the first l
elements are the non-e elements.
*/

public class S019 {

  public static void main(String[] args){
    int[][] exmp = {{3,2,2,3},{0,1,2,2,3,0,4,2},{3,4,5,5,5,7,7,9,5}};
    //removing instances of their last el
    for(int[] a: exmp){
      int l = removeEle(a,a[a.length-1]);
      System.out.printf("length = %d:",l);
      for(int i=0;i<l;i++)
        System.out.print(" " + a[i]);
      System.out.println();
    }
  }
  static int removeEle(int[] a,int e){
    int l =0;
    for(int i=0;i<a.length;i++)
      if(a[i] != e)
        a[l++] = a[i];
    return l;
  }

}
