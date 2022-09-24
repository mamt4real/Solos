package Solos;

import Cosc_301.MyLinkList;


public class S014 {

  public static void main(String[] args){
    Integer[] data = {2,3,4,5,6,7,9,1,10};
    MyLinkList l = new MyLinkList();
    l.assign(data);
    /*
    System.out.println("Original list\n" + l);
    for(int i = 1;i<=data.length;i++){
      System.out.printf("removing %dth element from last%n%s%n",i,remNthFrmLast(l,i));
      l.assign(data);
      */
      f(2);
    } 
  
  static void f(int n){
    if(n<= 0){
      System.out.println(n + " -- ");
    }else{
      System.out.print(n + " -- ");
	  f(n-1);
	  System.out.print(n*2 + ",");
	  f(n-2);
    }
  }
  static MyLinkList remNthFrmLast(MyLinkList lst,int n){
    if(n == 1){
      lst.extractLast();
      return lst;
    }
    int l = lst.length() - n;
    if(l == 0){
      lst.extractFirst();
      return lst;
    }
    MyLinkList.Element e = lst.getHead();
    while(l>1){
      e = e.getNext();
      l--;
    }
    e.setNext((e.getNext()).getNext());
    return lst;
    
  }

}
