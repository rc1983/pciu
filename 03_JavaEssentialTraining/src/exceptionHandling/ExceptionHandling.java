package exceptionHandling;

public class ExceptionHandling
{

	public static void main(String[] args) throws Exception
	{
		String welcome = "Welcome!";
		char[] chars = welcome.toCharArray();
		
//		Example of handling specific exceptions
		try
		{
			System.out.println("Last element: " + chars[chars.length-1]);
//			System.out.println("Last element: " + chars[chars.length]);
			System.out.println("Substring: " + welcome.substring(99));
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("There are: 0 - " + (chars.length-1) + " indexes in the chars array.");
			System.out.println("Therefore " + chars.length + " index is out of bounds.");
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("There are: 0 - " + (welcome.length()-1) + " indexes in \"" + welcome + "\" string.");
			e.printStackTrace();
		}
		
//		Using custom exceptions
		try
		{
			System.out.println("Last element: " + chars[chars.length-1]);
//			System.out.println("Last element: " + chars[chars.length]);
			System.out.println("Substring: " + welcome.substring(99));	
		}
		catch (Exception e)
		{
			System.out.println("There are: 0 - " + (chars.length-1) + " indexes in the chars array.");
			System.out.println("Therefore " + chars.length + " index is out of bounds.");
//			throw new CustomException();
			throw new CustomException("This is a custom exception", e);
//			throw new Exception("New exception", e);
		}
	}
}