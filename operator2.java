package ASSIGN;

/*
 * Assignment 3  Operators with static method by using method overloading concepts
 */
public class operator2 {

	public static void main(String[] args) 
	{
		multiplication(10,20);
		multiplication(10, 20, 30);
		multiplication(10, 60.9);
		multiplication(50.98, 20);
		multiplication("prachi", 'A');
	}
	
	public static void multiplication(int a,int b)
	{
		System.out.println("int ,int "+ a*b);
		
	}
	public static void multiplication(int a,int b,int c)
	{
		System.out.println("int ,int ,int"+ a*b*c);
	}
	public static void multiplication(int a,double b)
	{
		System.out.println("int ,double "+ a*b);		
	}
	public static void multiplication(double a,int b)
	{
		System.out.println("double ,int "+ a*b);
	}

	public static void multiplication(String a,char b)
	{
		System.out.println("string ,char "+ a + b);
	}
}
