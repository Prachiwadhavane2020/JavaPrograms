package ASSIGN;
//"Assignment 9 Find Aea of Rectangle using Scanner class"

import java.util.Scanner;

public class Area_of_Rectangle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for side:");
		int length=sc.nextInt();
		int width=sc.nextInt();
		System.out.println("area of rectangle:"+length*width);

	}

}
