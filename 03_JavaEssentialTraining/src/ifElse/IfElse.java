package ifElse;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class IfElse
{

	public static void main(String[] args)
	{
		LocalDateTime ldt = LocalDateTime.now();
		
		int monthNumber = ldt.getMonthValue();
		
//		There can be any number of else if statements between an if and else statement
//		however, the state condition has to be an else statement.
		if (monthNumber >= 1 && monthNumber <=3)
		{
			System.out.println("Q1");
		}
		else if (monthNumber >= 3 && monthNumber <=6)
		{
			System.out.println("Q2");
		}
		else if (monthNumber >= 6 && monthNumber <=9)
		{
			System.out.println("Q3");
		}
		else
		{
			System.out.println("Q4");
		}

	}

}
