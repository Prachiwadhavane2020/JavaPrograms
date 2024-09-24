package First;

public class Print {

	public static void main(String[] args) {
		
		int add=addition(5, 10);
		int sub=sub(10, 4);
		int mul=multiplication(200, 7);
		int div=division(40,2);
		int mod=mod(30,4);
		System.out.println("addition is:"+add);
		System.out.println("substraction is:"+sub);
		System.out.println("division is:"+div);
		System.out.println("multiplication is:"+mul);
		System.out.println("modulus is:"+mod);

	}
	public static int addition(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public static int division(int a,int b)
	{
		int c=a/b;
		return c;
	}
	public static int multiplication(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public static int mod(int a,int b)
	{
		int c=a%b;
		return c;
	}

}
