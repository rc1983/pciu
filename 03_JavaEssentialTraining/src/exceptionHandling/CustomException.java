package exceptionHandling;

public class CustomException extends Exception
{

	public CustomException()
	{
		System.out.println("This is a custom exception");
	}
	
	public CustomException(String message, Exception e)
	{
		System.out.println(message);
		System.err.println("Caused by: " + e);
	}
	
}
