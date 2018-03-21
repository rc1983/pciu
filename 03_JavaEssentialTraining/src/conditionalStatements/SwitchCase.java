package conditionalStatements;

import java.time.LocalDateTime;

public class SwitchCase
{
	public static void main(String[] args)
	{
		LocalDateTime ldt = LocalDateTime.now();
		int monthNumber = ldt.getMonthValue();
		
		switch (monthNumber)
		{
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			default:
				System.out.println("Month: " + monthNumber);
		}
		
//		switch statement with strings
		String str = "abc";
		
		switch(str)
		{
			case "abc":
				System.out.println(str);
				break;
			case "xyz":
				System.out.println(str);
				break;
			default:
				System.out.println("default");
		}
		
	}
}
