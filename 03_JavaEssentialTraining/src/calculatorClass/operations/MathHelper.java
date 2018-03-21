package calculatorClass.operations;

import java.util.ArrayList;
import java.util.Scanner;

public class MathHelper 
{
	public static Scanner input = new Scanner(System.in);
	
	public static void addition(ArrayList<String> listOfNumbers)
	{
		double d = 0;
		
		for (int i = 0; i < listOfNumbers.size(); i++)
		{
			d += Double.parseDouble(listOfNumbers.get(i));
		}
		
		System.out.println("Sum: " + d);
	}
	
	public static void subtraction(ArrayList<String> listOfNumbers)
	{
		double d = 0;
		
		for (int i = 0; i < listOfNumbers.size(); i++)
		{
			if(i == 0)
			{
				d = Double.parseDouble(listOfNumbers.get(i));
				System.out.println("First number is: " + d);
			}
			else
			{
				d -= Double.parseDouble(listOfNumbers.get(i));
			}
		}
		
		System.out.println("Subtraction: " + d);
	}
	
	public static void multiplication(ArrayList<String> listOfNumbers)
	{
		double d = 0;
		
		for (int i = 0; i < listOfNumbers.size(); i++)
		{
			if(i == 0)
			{
				d = Double.parseDouble(listOfNumbers.get(i));
				System.out.println("First number is: " + d);
			}
			else
			{
				d *= Double.parseDouble(listOfNumbers.get(i));
			}
		}
		
		System.out.println("Multiplication: " + d);
	}
	
	public static void division(ArrayList<String> listOfNumbers)
	{
		double d = 0;
		
		for (int i = 0; i < listOfNumbers.size(); i++)
		{
			if(i == 0)
			{
				d = Double.parseDouble(listOfNumbers.get(i));
				System.out.println("First number is: " + d);
			}
			else
			{
				d /= Double.parseDouble(listOfNumbers.get(i));
			}
		}
		
		System.out.println("Division: " + d);
	}
	
	public static void performOperation(ArrayList<String> listOfNumbers)
	{
		System.out.println("Choose an operation (+,-,*,/)");
		String operation = input.next();
		
		switch (operation)
		{
			case "+":
				MathHelper.addition(listOfNumbers);
				break;
			case "-":
				MathHelper.subtraction(listOfNumbers);
				break;
			case "*":
				MathHelper.multiplication(listOfNumbers);
				break;
			case "/":
				MathHelper.division(listOfNumbers);
				break;
			default:
				System.out.println("Not a valid choice.");
		}
		
		input.close();
	}
}
