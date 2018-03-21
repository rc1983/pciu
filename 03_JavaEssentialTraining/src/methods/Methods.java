package methods;

public class Methods
{
	
	static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
			"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	public static void main(String[] args)
	{
		System.out.println(forLoop("For loop"));
	}
	
	public static StringBuilder forLoop(String label)
	{
		System.out.println(label);
		for (int i = 0; i < label.length(); i++)
		{
			if(i == (label.length() - 1))
			{
				System.out.println("*");
			}
			else
			{
				System.out.print("*");
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < months.length; i++)
		{
			if (i < (months.length - 1))
			{
				sb.append(months[i] + ", ");
			}
			else
			{
				sb.append(months[i] + "." );
			}	
		}
		
		return sb;
	}
}
