package recursion;

public class RecursionExample
{

	public static void main(String[] args)
	{
		System.out.println("Countdown begins.");
		countDown(10);
		System.out.println("Countdown ends.");

	}
	
	public static void countDown(int count)
	{
//		This is the base case. Without this, there will be an infinite loop
		if(count == 0)
		{
			return;
		}
		System.out.println(count + "...");
		countDown(count - 1);
	}

}
