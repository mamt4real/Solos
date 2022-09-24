package Solos;

import java.util.Scanner;

public class S001{

  public static void main(String[] args){
  	Scanner in = new Scanner(System.in);
  	String inp[] = in.nextLine().split(" ");
  	int target = in.nextInt();
  	int[] nums = new int[inp.length];
  	for(int i=0;i<inp.length;i++)
  	   nums[i] = Integer.parseInt(inp[i]);
  	for(int i= 0;i<nums.length;i++)
  	  for(int j=i+1;j<nums.length;j++)
  	    if(nums[i] + nums[j] == target)
  	      System.out.printf("[%d,%d]",i,j);

  }

}
