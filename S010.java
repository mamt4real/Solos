package Solos;
/*This program takes an integer
and return its equivalent in 
roman numerals
constraint : 1<= n <= 3999
similarly it takes a string
in roman numerals and converts
it to number
*/
public class S010 {

  public static void main(String[] args){
  
    int[] num = {3,4,6,9,23,47,51,96,230,430,567,890,925,2356,3999,4500};
    String[] rom = new String[num.length];
    for(int i=0;i<rom.length;i++)
      rom[i] = numToR(num[i]);
    for(String s: rom)
      System.out.println(s + " = " + romToNum(s));

  }
  static String numToR(int n){
    if(n == 0 || n > 3999)
      return "";
    String res = "";
    while(n>= 1000){
      res += "M";
      n -= 1000;
    }if(n >= 900){
      res += "CM";
      n -= 900;
    }if(n>=500){
      res += "D";
      n -=500;
    }else if(n>= 400){
      res += "CD";
      n -= 400;
    }while(n >= 100){
      res+= "C";
      n -= 100;
    }if(n >= 90){
      res += "XC";
      n -= 90;
    }if(n >= 50){
      res += "L";
      n -= 50;
    }else if(n >= 40){
      res += "XL";
      n -= 40;
    }while(n >= 10){
      res += "X";
      n -= 10;
    }if(n == 9)
       return res + "IX";
    else if(n >= 5){
      res += "V";
      n -= 5;
    }else if(n == 4)
       return res + "IV";
    while(n>0){
      res += "I";
      n -= 1;
    }
    return  res;
  }
  static int romToNum(String rom){
    int res = 0,prv = 0,cur = 0;
    for(char c: rom.toCharArray()){
      cur = charVal(c);
      if(cur>prv){
         res -= prv;
         cur -= prv;
      }
      res += cur;
      prv = cur;
    }
    return res;
  }
  static int charVal(char c){
    switch(c){
      case 'M': return 1000;
      case 'D': return 500;
      case 'C': return 100;
      case 'L': return 50;
      case 'X': return 10;
      case 'V': return 5;
      case 'I': return 1;
    }
    return 0;
  }

}