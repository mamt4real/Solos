package Solos;
/*The method revNwise(l,n)
takes a list l and an integer l
and reverse the list n- wise
e.g input: [1,2,3,4,5,6] 2
output : [2,1,4,3,6,5]
*/
import java.util.ArrayList;

public class S017 {
  
  public static void main(String[] args){
    ArrayList exmp = new ArrayList();
    for(int i=1;i<13;i++)
      exmp.add(i);
    for(int i= 1;i<7;i++){
       revNwise(exmp,i);
       System.out.println(i+": "+exmp);
       revNwise(exmp,i);
    }
  }  
  static void revNwise(ArrayList l,int n){
    int c = l.size()/n;
    for(int i= 0;i<n*c;i+=n){
      int st = i, sp = i+n-1;
      if(sp >= l.size())
        return;
      while(st<sp){
        l.set(sp,l.set(st,l.get(sp)));
        st++;sp--;
      }
    }
  }

}