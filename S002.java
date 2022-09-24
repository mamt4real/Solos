package Solos;

import java.util.Iterator;
import java.util.LinkedList;


public class S002 {

  public static void main(String[] args){
    int[] ad = {2,4,8,5},bd = {5,6,4,7};
    LinkedList<Integer> a = new LinkedList<Integer>(),b = new LinkedList<Integer>();
    for(int i =0; i < ad.length;i++){
       a.add(ad[i]);
       b.add(bd[i]);
    }
    System.out.println(a);
    System.out.println(b);
    System.out.print(getSum(a,b));

  }
  
  static LinkedList getSum(LinkedList<Integer> a,LinkedList<Integer> b){
    int size = Math.min(a.size(),b.size());
    int cry = 0;
    LinkedList<Integer> res = new LinkedList<Integer>();
    Iterator ait = a.iterator(),bit = b.iterator();
    while(size>0){
      int x = (Integer)ait.next();
      int y = (Integer)bit.next();
      int sum = cry + x + y;
      if(sum >= 10){
        res.add(sum%10);
        cry = sum/10;
      }else{
        res.add(sum);
        cry = 0;
      }
      size--;
    }
    if(a.size() == b.size()){
       if(cry != 0)
          res.add(cry);
       return res;
    }  
    Iterator it = (ait.hasNext())?ait:bit;
    res.add((Integer)it.next() + cry);
    while(it.hasNext())
       res.add((Integer)it.next());
    return res;
  }

}
