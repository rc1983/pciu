package conditionalStatements;

public class Loops
{

	public static void main(String[] args)
	{
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
							"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
//		Example of a for loop
		for (int i = 0; i < months.length; i++)
		{
			if (i < (months.length - 1))
			{
				System.out.print(months[i] + ", ");
			}
			else
			{
				System.out.println(months[i] + "." );
			}	
		}
		
		System.out.println("This is a test!!");
		
//		Decrementing for loop
		for(int i = (months.length-1); i >= 0; i--)
		{
			if(i > 0)
			{
				System.out.print(months[i] + ", ");
			}
			else
			{
				System.out.println(months[i] + ".");
			}
		}		
		
		for (String month : months)
		{
			if (month.equals("Dec"))
			{
				System.out.println(month + ". ");
			}
			else
			{
				System.out.print(month + ", ");
			}
		}
		
		int counter = 0; 
		while (counter < months.length)
		{
			if (months[counter].equals("Dec"))
			{
				System.out.println(months[counter] + ". ");
			}
			else
			{
				System.out.print(months[counter] + ", ");
			}
			
			counter++;
		}
		
		counter = 0;
		do
		{
			if (months[counter].equals("Dec"))
			{
				System.out.println(months[counter] + ". ");
			}
			else
			{
				System.out.print(months[counter] + ", ");
			}
			
			counter++;
		} while (counter < months.length); 
			
	}

}
