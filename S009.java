package Solos;
/* this program takes an array of
integers representing lines
and returns the max area
between any two lines in the array
*/
public class S009 {

  public static void main(String[] args){
    int[] arr = {1,8,6,2,5,4,8,3,7};
    System.out.println(getMaxArea(arr));

  }
  static int getMaxArea(int[] pos){
    if(pos.length < 2)
      return 0;
    int max = 0;
    for(int i=0;i<pos.length;i++)
      for(int j =i+1;j<pos.length;j++)
        max = Math.max(max,getAr(pos[i],pos[j],j-i));
    return max;
  }
  static int getAr(int a,int b,int pos){
    return Math.min(a,b) * pos;
  }

}
