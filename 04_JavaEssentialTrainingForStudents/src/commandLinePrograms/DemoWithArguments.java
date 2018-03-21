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
 * javac DemoWithArguments.java (This should create class file in the same directory)
 * java DemoWithArguments "Hello world." "This is a demo."
 * 
 * This should print an output:
 *  
 * Hello world.
 * This is a demo.
 * 
 * @author Ravi
 *
 */

public class DemoWithArguments
{
	public static void main(String[] args)
	{
		for (String s : args)
		{
			System.out.println(s);
		}
	}
}
