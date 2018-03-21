package methods;

import java.util.Scanner;

public class MethodOverloading
{
	public static void main(String[] args)
	{
		String s1 = getInput("Enter value 1: ");
		String s2 = getInput("Enter value 2: ");
		String s3 = getInput("Enter value 3: ");

		addValues(s1, s2, s3);
		
		String[] a = getInput(4);
		addValues(a);
	}
	
	static String getInput(String prompt)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(prompt);
		String inputStr = input.nextLine();
		
		return inputStr;
	}
	
	static String[] getInput(int n)
	{
		Scanner input = new Scanner(System.in);
		String[] numbers = new String[n];
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println("Enter value " + (i+1) + ": ");
			numbers[i] = input.nextLine();
		}
		
		return numbers;
	}
	
	static void addValues(String s1, String s2)
	{
		double a = Double.parseDouble(s1) + Double.parseDouble(s2);
		
		System.out.println(s1 + " + " + s2 + " = " + a);
	}

	static void addValues(String s1, String s2, String s3)
	{
		double a = Double.parseDouble(s1) + Double.parseDouble(s2);
		
		System.out.println(s1 + " + " + s2 + " = " + a);
	}
	
	static void addValues(String...values)
	{
		double a = 0;
		for (int i = 0; i < values.length; i++)
		{
			a += Double.parseDouble(values[i]);
		}
		
		System.out.println("Sum: " + a);
	}
}
