package Solos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestPatternMatching {

  public static void main(String[] args) { 
  	String emailEx[] = {
  	  "abcd@gmail.com",
  	  "a@yahoo.com",
  	  "@haibd.com",
  	  "mamt4real@gmail.com",
  	  "dsf.bjj@vbjbf.com",
  	  "sfh-dgy!@mail.com"
  	};
  	
  	//\w+@\\w+\\\\.com
  	
  	String emPattern = "^[\\w-!]{4,}@\\w{3,6}\\.com$";
  	
  	Pattern pt = Pattern.compile(emPattern);
  	Matcher m = pt.matcher("sjdnxkm@xndkk.com");
  	System.out.println(m.matches());
  	
  	for(String s: emailEx){
  		Matcher ma = pt.matcher(s);
  		System.out.println(s+": "+ ma.matches());
  	}
  	
  	int x = 8;
  	String switchVar = "true";
  	/*
  	switch(switchVar){
  	  case (new Boolean(x<5)).toString():
  	      System.out.println("x is less than five");
  	      break;
  	  case (new Boolean(x<10)).toString():
  	      System.out.println("x is between five and 10");
  	      break;
  	  default:
  	      System.out.println("x is greater than 10");
  	      break;
  }*/

  }

}
