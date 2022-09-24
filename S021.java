package Solos;
/* the method divide(a,b) is an
implementation of integer division
but within signned range of [-231,231-1]
*/

public class S021 {

  public static void main(String[] args){
    
    int dnds[] = {10,7,-25,-37,2236,36};
    int ds[] = {1,-3,-6,4,5,6};
    for(int i=0;i<6;i++)
      System.out.printf("%d / %d = %d%n",dnds[i],ds[i],divide(dnds[i],ds[i]));

  }
  
  static int divide(int a, int b){ 
    int sign = (a<0 ^ b<0)?-1:1;
    int res = 0;
    a = Math.abs(a);
    b = Math.abs(b);
    if(b>a)
      return 0;
    if(b == 1)
      return sign * a;
    while(a>=b){
      a -= b;
      res++;
    }
    return res *sign;
  }

}
