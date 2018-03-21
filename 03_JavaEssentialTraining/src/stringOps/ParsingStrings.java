package stringOps;

public class ParsingStrings
{

	public static void main(String[] args)
	{
		String s1 = "Hello world!";
		
		System.out.println("Length of string: " + s1.length());
		
		int position = s1.indexOf("llo");
		System.out.println("Position of substring: " + position);
		
		String sub = s1.substring(5);
		System.out.println("Substring: " + sub);
		
		String s2 = "SPACES          ";
		int len1 = s2.length();
		System.out.println("Length before trim: " + len1);
		
		String s3 = s2.trim();
		int len2 = s3.length();
		
		System.out.println("Length after trim: " + len2);
	}
}
