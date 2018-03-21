package commandLinePrograms;

/**
 * The goal of this exercise to run this particular program through the command line
 * JAVA_HOME should be set as a system environment variable. in command line, 
 * java -version should return a version.
 * 
 * Once this is set, copy the text without the comments and package declaration and
 * create a new class through a text editor and paste the contents. I will make the assumption
 * that the class is created in C:\temp 
 * 
 * Navigate to C:\temp through command line. 
 * 
 * Run the following commands - 
 * 
 * javac NumConversion.java (This should create class file in the same directory)
 * java NumConversion 7
 * 
 * This should print an output:
 *  
 * You entered: 7
 * 
 * @author Ravi
 *
 */

public class NumConversion
{

	public static void main(String[] args)
	{
		int firstArg = 0;
		
		if(args.length > 0)
		{
			try
			{
				firstArg = Integer.parseInt(args[0]);
			}
			
			catch(NumberFormatException e)
			{
				System.err.println("The argument " + args[0] + " is not an integer.");
			}
			
			System.out.println("You entered: " + firstArg);
		}
	}

}
