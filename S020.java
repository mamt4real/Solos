package Solos;

/**
 * strStr - just an implementation of String.indexOf
 *
 * @hay: haystack - the string to search
 * @ned: needle - the target substr
 *
 * Return: first index of ned or -1 
*/

public class S020 {

  public static void main(String[] args){
    String hays[] = {"hello","aaaaa","kwalkwali"};
    String neds[] = {"ll","bba","ali"};
    for(int i=0;i<hays.length;i++)
      System.out.println(strStr(hays[i],neds[i]));
  }
  
  static int strStr(String hay,String ned){
    if(ned.equals(""))
      return 0;
    for(int i=0;i<hay.length();i++){
      if(hay.charAt(i) == ned.charAt(0)){
        String sub = hay.substring(i,i+ned.length());
        if(ned.equals(sub))
          return i;
      }
    }
    return -1;
  }

}
