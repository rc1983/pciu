package arrays.doubleArrays;

import java.util.Scanner;

public class PopulateArray
{
	private int _rows;
	private int _columns;
	
	public static Scanner input = new Scanner(System.in);
	
	public int[][] populateArray(int rows, int columns)
	{
		this._rows = rows;
		this._columns = columns;
		
		int[][] intDoubleArray = new int[rows][columns];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				System.out.println("Enter element, " + i + " row, and " + j + " column: ");
				intDoubleArray[i][j] = input.nextInt(); 
			}
		}
		
		return intDoubleArray;
	}
	
	public int getRows()
	{
		return _rows;
	}
	public int getColumns()
	{
		return _columns;
	}
	
	public void setRows(int rows)
	{
		this._rows = rows;
	}
	public void setColumns(int columns)
	{
		this._columns = columns;
	}
}