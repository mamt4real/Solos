package Solos;
/*this programa takes
a string argument and 
convert it into int32
integer.
it returns int_min or
int_max when an overflow
occurs*/
public class S007 {

  public static void main(String[] args){
  
   System.out.println(toInt("42"));
   System.out.println(toInt(" -42"));
   System.out.println(toInt("4193 with words"));
   System.out.println(toInt("words and 987")); System.out.println(toInt("-91283472332"));

  }
  
  static int toInt(String s){
    if(s.equals("") || s == null)
      return 0;
    char c = s.charAt(0);
    if(c == ' ' || c == '+')
       return toInt(s.substring(1));
    else if(c == '-'){
      int min = 1<<31;
      int res = toInt(s.substring(1));
      if(res == min - 1)
         return min;
      return -1*res;
    }
    else if(!Character.isDigit(c))
      return 0;
    else{
      long res = getDigit(c);
      int i = 1;
      c = s.charAt(i);
      int max = (1<<31)-1;
      while(Character.isDigit(c)){
        res = res*10 + getDigit(c);
        i++;
        if(i==s.length())
          break;
        c = s.charAt(i);
      }
      if(res < max)
         return (int)res;
      else
         return max;
    }
  }
  
  static int getDigit(char c){
    switch(c){
      case '0': return 0;
      case '1': return 1;
      case '2': return 2;
      case '3': return 3;
      case '4': return 4;
      case '5': return 5;
      case '6': return 6;
      case '7': return 7;
      case '8': return 8;
      case '9': return 9;
    }
    return 0;
  }

}
