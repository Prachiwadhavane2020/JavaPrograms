package ASSIGN;

//"Assignment 13 WAP on thread class (thread.sleep)"

public class threadcCass {
	public static void main(String[] args) throws InterruptedException
	{
		Thread th=new Thread();
		for(int i=1;i<11;i++)
		{
			System.out.println(i);
			th.sleep(1000);
		}
	}
}
