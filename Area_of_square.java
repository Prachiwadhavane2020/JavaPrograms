package ASSIGN;
//"Assignment 8 Find Area of Square using Scanner class"

import java.util.Scanner;

public class Area_of_square 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for side:");
		int side=sc.nextInt();
		int area=side*side;
		
		System.out.println("area of suare:"+area);
	}

}
