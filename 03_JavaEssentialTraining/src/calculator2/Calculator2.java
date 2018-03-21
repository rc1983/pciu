package calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator2
{
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ArrayList<String> listOfNumbers = getInput(8);
		performOperation(listOfNumbers);
	}
	
	public static ArrayList<String> getInput(int n)
	{
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter value " + (i + 1) + ": ");
			String s = input.nextLine();
			try
			{
				Double.parseDouble(s);
				al.add(s);
			}
			catch(Exception e)
			{
				System.out.println("The value is not a valid number.");
				e.printStackTrace();
			}
			
		}
		
		return al;
	}
	
	public static void performOperation(ArrayList<String> listOfNumbers)
	{
		System.out.println("Choose an operation (+,-,*,/)");
		String operation = input.next();
		
		switch (operation)
		{
			case "+":
				addition(listOfNumbers);
				break;
			case "-":
				subtraction(listOfNumbers);
				break;
			case "*":
				multiplication(listOfNumbers);
				break;
			case "/":
				division(listOfNumbers);
				break;
			default:
				System.out.println("Not a valid choice.");
		}
		
		input.close();
	}
	
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
}