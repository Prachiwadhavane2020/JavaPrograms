package ASSIGN;

import java.util.Scanner;

// "Assignment 6 Find circumference of circle using Scanner class"

public class Circumference_of_Circle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for radius:");
		int rad=sc.nextInt();
		double circum=2*3.14*rad;
		System.out.println("circumference of circle :"+circum);
	}
}
