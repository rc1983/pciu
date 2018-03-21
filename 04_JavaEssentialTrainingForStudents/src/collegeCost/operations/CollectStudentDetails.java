package collegeCost.operations;

import java.util.Scanner;

import collegeCost.model.CollegeYear;
import collegeCost.model.Expenses;
import collegeCost.model.Student;

public class CollectStudentDetails
{
	public static Scanner input = new Scanner(System.in);
	
	public static void collectStudentDetails()
	{
		Student student = new Student();
		Expenses e = null; 
		double grandTotal = 0;
		
		System.out.println("Enter the name of the student: ");
		student.setName(input.nextLine());
		
		System.out.println("1. Freshman");
		System.out.println("2. Sophomore");
		System.out.println("3. Junior");
		System.out.println("4. Senior");
		System.out.println("Enter the college year: ");
		int year = input.nextInt();
		
		do
		{
			switch(year)
			{
				case 1:
					student.setCollegeYear(CollegeYear.FRESHMAN);
					break;
				case 2:
					student.setCollegeYear(CollegeYear.SOPHOMORE);
					break;
				case 3:
					student.setCollegeYear(CollegeYear.JUNIOR);
					break;
				case 4:
					student.setCollegeYear(CollegeYear.SENIOR);
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		} while(year < 1 || year > 4);
		
		
		System.out.println("Is " + student.getName() + " living on campus? (y/n)");
		String onCampus = input.next();
		
		while (!onCampus.equalsIgnoreCase("y") && !onCampus.equalsIgnoreCase("n"))
		{
			System.out.println("Invalid choice.");
			System.out.println("Is " + student.getName() + " living on campus? (y/n)");
			onCampus = input.next();
		}
		
		System.out.println("Enter number of credit hours per year: ");
		int numberOfCreditHoursPerYEar = input.nextInt();
		System.out.println("Enter the cost of credit hour: ");
		double costOfCreditHour = input.nextDouble();
		System.out.println("Enter the cost of supplies per year: ");
		double costOfSuppliesPerYear = input.nextDouble();
		System.out.println("Enter other expenses per year: ");
		double otherExpenses = input.nextDouble();
		
		if (onCampus.equalsIgnoreCase("y"))
		{
			student.setOnCampus(true);
		}
		else
		{
			student.setOnCampus(false);
		}
		
		if (student.isOnCampus())
		{
			System.out.println("Enter dorm fees per month: ");
			double dormFees = input.nextDouble();
			System.out.println("Enter duration of study in dorm (months): ");
			int durationOfStay = input.nextInt();
			System.out.println("Enter Cost of meal plan per month: ");
			double costOfMealPlan = input.nextDouble();
			
			e = new Expenses(dormFees, durationOfStay, costOfMealPlan, otherExpenses, numberOfCreditHoursPerYEar, costOfCreditHour, costOfSuppliesPerYear); 
			
			e.setExpensesOnCampus(e.getDormFees(), e.getDurationOfStay(), e.getCostOfMealPlan(), e.getOtherExpenses(), e.getNumberOfCreditHoursPerYEar(), e.getCostOfCreditHour(), e.getCostOfSuppliesPerYear());
			grandTotal = e.getExpensesOnCampus();
		}
		
		else if(!student.isOnCampus())
		{
			System.out.println("Enter rent per month: ");
			double rent = input.nextDouble();
			
			e = new Expenses(rent, otherExpenses, numberOfCreditHoursPerYEar, costOfCreditHour, costOfSuppliesPerYear);
			
			e.setExpensesOffCampus(rent, otherExpenses, numberOfCreditHoursPerYEar, costOfCreditHour, costOfSuppliesPerYear);
			
			grandTotal = e.getExpensesOffCampus();
		}
		
		printStudentDetails(student, e, grandTotal);
	}
	
	private static void printStudentDetails(Student student, Expenses expenses, double grandTotal)
	{
		System.out.println("Name of the student: " + student.getName());
		System.out.println(student.getName() + " is in " + student.getCollegeYear() + " year.");
		if(student.isOnCampus())
		{
			System.out.println(student.getName() + " is living on campus.");
		}
		else
		{
			System.out.println(student.getName() + " is not living on campus.");
		}
		
		System.out.println("The total yearly expenses for " + student.getName() + " in " + student.getCollegeYear() + " are: " + grandTotal);
	}
}