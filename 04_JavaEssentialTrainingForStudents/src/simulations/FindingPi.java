package simulations;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FindingPi
{

	public static void main(String[] args)
	{
		System.out.println("10000 attemps. Pi = " + getPi(10000));
		System.out.println("100000 attemps. Pi = " + getPi(100000));
		System.out.println("1000000 attemps. Pi = " + getPi(1000000));
		System.out.println("10000000 attemps. Pi = " + getPi(10000000));
		System.out.println("100000000 attemps. Pi = " + getPi(100000000));
		
		Calendar cal = Calendar.getInstance();
		
//		This attempt takes upto a minute to finish. Commenting it out for now. 
//		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//		System.out.println(sdf.format(cal.getTime()));
//		
//		System.out.println("1000000000 attemps. Pi = " + getPi(1000000000));
//		
//		Calendar cal2 = Calendar.getInstance();
//		System.out.println(sdf.format(cal2.getTime()));
	}
	
	public static double getPi(int numberOfAttempts)
	{
		int numberOfPointsWithinCircle = 0;
		
		for (int i = 0; i < numberOfAttempts; i++)
		{
			double x = ((Math.random() * 2) - 1);
			double y = ((Math.random() * 2) - 1);
			
			double distribution = Math.sqrt((x * x) + (y * y));
			
			if(distribution < 1)
			{
				numberOfPointsWithinCircle += 1;
			}
		}
		
		double pi = (double) 4 * numberOfPointsWithinCircle/numberOfAttempts;
		
		return pi;
	}
}