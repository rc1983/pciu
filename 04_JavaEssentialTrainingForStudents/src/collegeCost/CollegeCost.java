package collegeCost;

import collegeCost.*;
import collegeCost.operations.CollectStudentDetails;

/**
 * Compute the yearly expenses for a student
 * Is the student living in a dorm?
 * Is so, what is the duration of the stay? (number of months)
 * What are the estimated living expenses for a dorm student (not including room and board)?
 * What is the cost of room and board?
 * 
 * For all students, ask the following: 
 * Name
 * Year (freshman, sophomore, junior, senior)
 * Cost of supplies (including textbooks)
 * Number of credit hours
 * Cost of credit hour
 * 
 * Use methods for each request
 * 
 * @author Ravi
 *
 */
public class CollegeCost
{

	public static void main(String[] args)
	{
		CollectStudentDetails.collectStudentDetails();
	}

}
