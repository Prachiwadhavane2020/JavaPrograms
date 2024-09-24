package First;
// assertion= it is nothing but comaparison between expected result and actual result
public class AssertionClass {
	public static void main(String[] args) 
	{
		int age=67;
		//format 1
		assert age ==17:"age is not expected";
		
		//format 2
		assert age>=18;
		System.out.println("age is greater");

	}
}
