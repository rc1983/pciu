package singleton;

public class Main
{

	public static void main(String[] args)
	{
		MySingleton date = MySingleton.getInstance();
		
//		This is not valid because there is no public constructor
//		MySingleton date3 = new MySingleton();
		
		date.printCurrntDate();
		MySingleton.getInstance().printCurrntDate();

	}

}
