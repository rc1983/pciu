package stringOps;

import java.io.InputStream;
import java.util.Scanner;

public class StringOps
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String str1 = "Hello";
		String str2 = "World";
		
		String str3 = str1 + " " + str2 + "!";
		
		System.out.println(str3);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello").append(" ").append("World!");
		
		System.out.println(sb);
		
		sb.delete(0, sb.length());
		
		System.out.println("After delete: " + sb);
		
		String x ="z";
		
//		for(int i = 0; i < 3; i++)
//		{
//			x = input.nextLine();
//			sb.append(x);
//		}
		
		System.out.println(sb);
		
		String str4 = "Hello";
		String str5 = "Hello";
		
		if(str4 == str5)
		{
			System.out.println("Match");
		}
		else
		{
			System.out.println("Not identical");
		}
		
		if(str4.equals(str5))
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");
		}
		
		String part1 = str4 + str5;
		String part2 = "HelloHello";
		
		System.out.println(part1);
		System.out.println(part2);
		
		if(part1 == part2)
		{
			System.out.println("Match");
		}
		else
		{
			System.out.println("Not identical");
		}
		
		if(part1.equals(part2))
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");
		}
		
	}
}
