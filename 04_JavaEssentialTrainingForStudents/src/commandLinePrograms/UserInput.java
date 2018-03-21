package commandLinePrograms;

import java.util.Scanner;

/**
 * Run this program through command line. Follow the instructions described in Demo.java
 * 
 * The program should ask the user for name and age, and then display the values. 
 * 
 * @author 
 *
 */
public class UserInput
{

	public static void main(String[] args)
	{
		
		try(Scanner input = new Scanner(System.in))
		{
			System.out.println("Enter name: ");
			String name = input.nextLine();
			
			System.out.println("Enter age: ");
			int age = Integer.parseInt(input.nextLine());
			
			System.out.println("The name is: " + name);
			System.out.println("The age is: " + age);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please try again.");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Unknown exception");
			e.printStackTrace();
		}
	}

}
