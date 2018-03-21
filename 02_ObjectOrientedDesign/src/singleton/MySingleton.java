package singleton;
import java.util.Date;

public class MySingleton
{
	private static MySingleton __me = null;
	
	private MySingleton()
	{
		super();
	}

	public static MySingleton getInstance()
	{
		if (__me == null)
		{
			__me = new MySingleton();
		}
		
		return __me;
	}
	
	public void printCurrntDate()
	{
		Date date = new Date();
		System.out.println("The current date is: " + date);
	}
}
