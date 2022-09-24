package Solos;

/**
 * getPrefix - extracts the common prefix
 * from an array of strings
 * 
 * Description:
 * The method first find the shortest
 * string among the array.
 * Then use it as the assumed prefix
 * Total time complexity is O(n2)
 *
 * @arr: an array of strings
 *
 * Return: The prefix as a string
 */

public class S011 {

  public static void main(String[] args){
    String[][] exmp = {{"flower","flow","flight"},
    {"capital","capsule","captain"},
    {"lexus","length","left"},
    {"dog","racecar","car"}};
    for(String[] strs: exmp)
      System.out.println(getPrefix(strs));
  }
  
  static String getPrefix(String[] arr){
    String sh = getShort(arr);
    String prefix = "";
    for(int i = 0;i<sh.length();i++){
      char c = sh.charAt(i);
      boolean found = true;
      for(String s: arr){
        if(s.charAt(i) != c){
          found = false;
          break;
        }
      }
      if(found)
         prefix += c;
      else
         break;
    }
    return prefix;
  }
  static String getShort(String[] arr){
    String str = arr[0];
    for(String s: arr)
      if(s.length()<str.length())
         str = s;
    return str;
  }

}
