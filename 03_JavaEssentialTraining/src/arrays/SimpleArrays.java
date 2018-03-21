package arrays;

import java.util.Arrays;

import javax.lang.model.util.Elements;

public class SimpleArrays
{

	public static void main(String[] args)
	{
		int[] ints = {99, 2, 3};
		
		String[] strings = {"x", "a", "b", "c"};
		
//		Calling the sort on ints will change the original order of elements. This is call by reference
		Arrays.sort(ints);
		
		for(int i = 0; i < ints.length; i++)
		{
			System.out.println(ints[i]);
		}
		
		Arrays.sort(strings);
		
		for(int i = 0; i < strings.length; i++)
		{
			System.out.println(strings[i]);
		}
		
		int[] copied = new int[ints.length];
		System.arraycopy(ints, 0, copied, 0, ints.length);
		
		for(int i = 0; i < copied.length; i++)
		{
			System.out.println(copied[i]);
		}
		
	}

}
