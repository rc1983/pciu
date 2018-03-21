package simpleCalc;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCalc
{
	public static void main(String[] args) throws ParseException
	{
		ArrayList <String> userInput = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		int numberOfNumbers;
		double total = 0;
		
		NumberFormat numF = NumberFormat.getNumberInstance();
		
		System.out.println("How many numbers do you want to add?");
		numberOfNumbers = input.nextInt();
		
		for(int i = 0; i < numberOfNumbers; i++)
		{
			System.out.println("Enter a number: ");
			userInput.add(input.next());
		}
		
		for (int i = 0; i < userInput.size(); i++)
		{
			try
			{
				numF.parse(userInput.get(i));
			}
			catch (Exception e)
			{
				userInput.remove(i);
			}
		}
		
		for(int i = 0; i < userInput.size(); i++)
		{
			Number temp = numF.parse(userInput.get(i));
			total += temp.doubleValue();
		}
		
		System.out.println("Total: " + total);
		input.close();
	}
}