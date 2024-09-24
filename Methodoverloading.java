package ASSIGN;
/*
 * Assignment 4 Operators with Non Static  method by using method overloading concepts
 */
public class Methodoverloading {

	public static void main(String[] args)
	{
		Methodoverloading m=new Methodoverloading();
		m.multiplication(10,20);
		m.multiplication(10, 20, 30);
		m.multiplication(10, 60.9);
		m.multiplication(50.98, 20);
		m.multiplication("prachi", 'A');
	}
	public void multiplication(int a,int b)
	{
		System.out.println("int ,int "+ a*b);
		
	}
	public void multiplication(int a,int b,int c)
	{
		System.out.println("int ,int ,int"+ a*b*c);
	}
	public void multiplication(int a,double b)
	{
		System.out.println("int ,double "+ a*b);		
	}
	public void multiplication(double a,int b)
	{
		System.out.println("double ,int "+ a*b);
	}

	public  void multiplication(String a,char b)
	{
		System.out.println("string ,char "+ a + b);
	}

}
