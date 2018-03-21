package monteCarloChallenge;

import java.util.ArrayList;
import java.util.Random;

public class MonteCarloChallenge
{

	public static void main(String[] args)
	{
		drawMarbles(10);
		drawMarbles(100);
		drawMarbles(1000);
		drawMarbles(10000);
		drawMarbles(100000);
	}
	
	public static void drawMarbles(int numberOfTries)
	{
		int numberOfWins = 0;
		
		double successRate = 0.0;
		
		for (int i = 0; i < numberOfTries; i++)
		{
			ArrayList<String> bowl = populateBowl();
			String[] newBowl = new String[3];
			newBowl = pickMarbles(bowl, newBowl);
			
			if (newBowl[0] == newBowl[1] && newBowl[1] == newBowl[2])
			{
				numberOfWins += 1;
			}
		}
		
		successRate = (double) numberOfWins/numberOfTries; 
		
		System.out.println("Number of wins: " + numberOfWins + ", Try Number: " + numberOfTries + ", Success Rate: " + successRate);
		
	}
	
	public static String[] pickMarbles(ArrayList<String> bowl, String[] destinationBowl)
	{
		Random random = new Random();
		
		for (int i = 0; i < 3; i++)
		{
			int elementToPick = random.nextInt(bowl.size());
			destinationBowl[i] = bowl.get(elementToPick);
			bowl.remove(elementToPick);
		}
		
		return destinationBowl;
	}
	
	public static ArrayList<String> populateBowl()
	{
		final String BLUE = "Blue";
		final String WHITE = "White";
		
		ArrayList<String> bowl = new ArrayList<String>();
		
		Random random = new Random();
		
		for (int i = 0; i < 6; i++)
		{
			int elementNumber = random.nextInt(2);
			if (elementNumber == 0)
			{
				bowl.add(WHITE);
			}
			else
			{
				bowl.add(BLUE);
			}
		}
		
		return bowl;
	}

}
