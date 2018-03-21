package arrays.doubleArrays;

import java.util.Scanner;

public class DoubleArrays
{

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		PopulateArray pa = new PopulateArray();
		
		int[][] doubleArray = pa.populateArray(3, 2);
		
		System.out.println("\nPrinting double array: ");
		
		for (int i = 0; i < pa.getRows(); i++)
		{
			for (int j = 0; j < pa.getColumns(); j++)
			{
				System.out.print(doubleArray[i][j] + " ");
			}
			System.out.println();
		}
		
		PopulateObjectArray poa = new PopulateObjectArray();
		Object[][] doubleObjectArray = poa.populateObjectArray(2, 2);
		
		for (int i = 0; i < poa.getRows(); i++)
		{
			for (int j = 0; j < poa.getColumns(); j++)
			{
				System.out.print(doubleObjectArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
