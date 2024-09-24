package ASSIGN;
 /*
  * "Assignment 5 Find Area of Circle using Scanner  class"
  */

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for radius:");
		int rad=sc.nextInt();
		double area = 3.14*rad*rad;
		System.out.println("Area of circle:"+ area);

	}

}
