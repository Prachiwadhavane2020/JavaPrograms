package ASSIGN;

import java.util.Scanner;

//"Assignment 7 Find Area of Triangle using Scanner class"

public class Area_triangle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int height= sc.nextInt();
		System.out.println("enter the base of triangle:"+base+height);
		System.out.println("area of triangle is:"+ 0.5*base*height);
	}
}
