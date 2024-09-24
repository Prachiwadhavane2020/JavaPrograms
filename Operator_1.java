package ASSIGN;
// "Assignment 2
// Operators(+,-,*,/,%) using non_static method"

public class Operator_1 
{
	public static void main(String[] args) 
	{
		Operator_1 op=new Operator_1();
		System.out.println("addition is :"+op.addition(10, 20));
		System.out.println("substraction is :"+op.sub(100, 20));
		System.out.println("multiplication is :"+op.mul(10, 20));
		System.out.println("division is :"+op.div(100, 20));
		System.out.println("modulus is :"+op.mod(100, 20));

	}
	
	public int addition (int a ,int b)	
	{
		return a+b;
		
	}
	public int sub (int a ,int b)	
	{
		return a-+b;
		
	}
	public int mul (int a ,int b)	
	{
		return a*b;
		
	}
	public int div (int a ,int b)	
	{
		return a/b;
		
	}
	public int mod (int a ,int b)	
	{
		return a%b;
		
	}

}
