package arrays.doubleArrays;

import java.util.Scanner;

public class PopulateObjectArray
{
	private int _rows;
	private int _columns;
	
	public static Scanner input = new Scanner(System.in);
	
	public Object[][] populateObjectArray(int rows, int columns)
	{
		this._rows = rows;
		this._columns = columns;
		
		Object[][] objectDoubleArray = new Object[rows][columns];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				System.out.println("Enter element, " + i + " row, and " + j + " column: ");
				objectDoubleArray[i][j] = input.nextLine(); 
			}
		}
		
		return objectDoubleArray;
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