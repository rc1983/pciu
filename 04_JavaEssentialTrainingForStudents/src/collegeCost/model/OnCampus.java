package collegeCost.model;

import java.util.Scanner;

@Deprecated
public class OnCampus
{
	private static Scanner input = new Scanner(System.in); 
	
	public static boolean isOnCampus()
	{
		boolean isOnCampus = false;
		
		System.out.println("Does the student live on campus? (y/n)");
		String onCampus = input.nextLine();
		
		while(!onCampus.equalsIgnoreCase("y") && !onCampus.equalsIgnoreCase("n"))
		{
			System.out.println("Invalid choice. Please enter (y/n): ");
			onCampus = input.nextLine();
		}
		
		if(onCampus.equalsIgnoreCase("y"))
		{
			isOnCampus = true;
		}
		else if (onCampus.equalsIgnoreCase("n"))
		{
			isOnCampus = false;
		}
		
		return isOnCampus;
	}
}
