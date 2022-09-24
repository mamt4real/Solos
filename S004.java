package Solos;
import java.util.Arrays;
/*This program takes two
sorted arrays as input
and return the median
of them*/
public class S004 {

  public static void main(String[] args){
    int[] a={3,7,9,18,23,25},b={1,6,17,20};
    System.out.println(Arrays.toString(merge(a,b)));
    System.out.println(getMedian(a,b));
    System.out.print(getMedian2(a,b));

  }
  
  static double getMedian(int[] a,int[] b){
    int[] c = merge(a,b);
    int mid = c.length/2;
    if(c.length % 2 == 1)
      return c[mid];
    return (c[mid] + c[mid-1])/2.0;
  }
  static double getMedian2(int[] a,int[] b){
    int x = a.length+b.length;
    int ai = 0, bi = 0,mid = 0;
    boolean isA = true;
    for(int i=0;i<=x/2;i++){
      if(a[ai] < b[bi]){
         mid = a[ai++];
         isA = true;
      }else{
        mid = b[bi++];
        isA = false;
      }
    }
    if(x % 2 == 1)
      return mid;
    else{
      mid += isA?Math.min(a[ai-1],b[bi]):Math.min(b[bi-1],a[ai]);
      return mid/2.0;
      /*if(isA)
        return (a[ai] + Math.min(a[ai-1],b[bi]))/2.0;
      else
        return (b[bi] + Math.min(b[bi-1],a[ai]))/2.0;*/
    }
    
  }
  
  static int[] merge(int[] a,int[] b){
    int[] c = new int[a.length+b.length];
    int ai=0,bi=0,ci=0;
    while(true){
      if(a[ai]<b[bi])
        c[ci++] = a[ai++];
      else
        c[ci++] = b[bi++];
      if(bi==b.length || ai==a.length)
        break;   
    }
    if(bi < b.length)
      for(int i=ci;i<c.length;i++)
         c[i] = b[bi++];
    else if(ai < a.length)
      for(int i=ci;i<c.length;i++)
         c[i] = a[ai++];
    return c;
  }
  
  static int[] mergeSort(int[] a){
    if(a.length <=1)
       return a;
    int x = a.length/2;
    int[] b = new int[x],c = new int[a.length-x];
    System.arraycopy(a,0,b,0,x);
    System.arraycopy(a,x,c,0,a.length-x);
    b = mergeSort(b);
    c = mergeSort(c);
    return merge(b,c);
  }

}
