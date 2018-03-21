package collegeCost.model;

public class Expenses
{
	private double _dormFees;
	private int _durationOfStay;
	private double _costOfMealPlan;
	private double _rent;
	private double _otherExpenses;
	private int _numberOfCreditHoursPerYear;
	private double _costOfCreditHour;
	private double _costOfSuppliesPerYear;
	
	private double _expensesOnCampus;
	private double _expensesOffCampus;
	
	public double getDormFees()
	{
		return _dormFees;
	}
	public int getDurationOfStay()
	{
		return _durationOfStay;
	}
	public double getCostOfMealPlan()
	{
		return _costOfMealPlan;
	}
	public double getRent()
	{
		return _rent;
	}
	public double getOtherExpenses()
	{
		return _otherExpenses;
	}
	public int getNumberOfCreditHoursPerYEar()
	{
		return _numberOfCreditHoursPerYear;
	}
	public double getCostOfCreditHour()
	{
		return _costOfCreditHour;
	}
	public double getCostOfSuppliesPerYear()
	{
		return _costOfSuppliesPerYear;
	}
	public double getExpensesOnCampus()
	{
		return _expensesOnCampus;
	}
	public double getExpensesOffCampus()
	{
		return _expensesOffCampus;
	}
	
	public void setDormFees(double dormFees)
	{
		this._dormFees = dormFees;
	}
	public void setDurationOfStay(int durationOfStay)
	{
		this._durationOfStay = durationOfStay;
	}
	public void setCostOfMealPlan(double costOfMealPlan)
	{
		this._costOfMealPlan = costOfMealPlan;
	}
	public void setRent(double rent)
	{
		this._rent = rent;
	}
	public void setOtherExpenses(double otherExpenses)
	{
		this._otherExpenses = otherExpenses;
	}
	public void setNumberOfCreditHoursPerYear(int numberOfCreditHoursPerYear)
	{
		this._numberOfCreditHoursPerYear = numberOfCreditHoursPerYear;
	}
	public void setCostOfCreditHour(double costOfCreditHour)
	{
		this._costOfCreditHour = costOfCreditHour;
	}
	public void setCostOfSuppliesPerYear(double costOfSuppliesPerYear)
	{
		this._costOfSuppliesPerYear = costOfSuppliesPerYear;
	}
	
	public void setExpensesOnCampus(double dormFees, int durationOfStay, double costOfMealPlan, double otherExpenses, int numberOfCreditHoursPerYear, double costOfCreditHour, double  costOfSuppliesPerYear)
	{
		double expensesOnCampus = 0;
		
		expensesOnCampus = (dormFees * durationOfStay) + 
							(costOfMealPlan * durationOfStay) + 
							otherExpenses + 
							(costOfCreditHour * numberOfCreditHoursPerYear) + 
							costOfSuppliesPerYear;
		this._expensesOnCampus = expensesOnCampus;
	}
	
//	public double calculateTotal(double dormFees, int durationOfStay, double costOfMealPlan, double otherExpenses, int numberOfCreditHoursPerYear, double costOfCreditHour, double  costOfSupplies)
//	{
//		double total = 0;
//		
//		total = (dormFees * durationOfStay) + 
//				(costOfMealPlan * durationOfStay) + 
//				otherExpenses + 
//				(costOfCreditHour * numberOfCreditHoursPerYear) + 
//				costOfSupplies;
//		
//		return total;
//	}
	
	public void setExpensesOffCampus(double rent, double otherExpenses, int numberOfCreditHoursPerYear, double costOfCreditHour, double  costOfSuppliesPerYear)
	{
		double expensesOffCampus = 0;
		
		expensesOffCampus = (rent * 12) + 
							otherExpenses + 
							(costOfCreditHour * numberOfCreditHoursPerYear) + 
							costOfSuppliesPerYear;
		this._expensesOffCampus = expensesOffCampus;
	}
	
//	public double calculateTotal(double rent, double otherExpenses, int numberOfCreditHoursPerYear, double costOfCreditHour, double  costOfSupplies)
//	{
//		double total = 0;
//		
//		total = (rent * 12) + 
//				otherExpenses + 
//				(costOfCreditHour * numberOfCreditHoursPerYear) + 
//				costOfSupplies;
//		
//		return total;
//	}
	
	public Expenses (double dormFees, int durationOfStay, double costOfMealPlan, double otherExpenses, int numberOfCreditHoursPerYear, double costOfCreditHour, double  costOfSupplies)
	{
		this._dormFees = dormFees;
		this._durationOfStay = durationOfStay;
		this._costOfMealPlan = costOfMealPlan;
		this._otherExpenses = otherExpenses;
		this._numberOfCreditHoursPerYear = numberOfCreditHoursPerYear;
		this._costOfCreditHour = costOfCreditHour;
		this._costOfSuppliesPerYear = costOfSupplies;
		this._rent = 0;
		this._expensesOffCampus = 0;
	}
	
	public Expenses (double rent, double otherExpenses, int numberOfCreditHoursPerYear, double costOfCreditHour, double  costOfSupplies)
	{
		this._dormFees = 0;
		this._durationOfStay = 0;
		this._costOfMealPlan = 0;
		this._otherExpenses = otherExpenses;
		this._numberOfCreditHoursPerYear = numberOfCreditHoursPerYear;
		this._costOfCreditHour = costOfCreditHour;
		this._costOfSuppliesPerYear = costOfSupplies;
		this._rent = rent;
		this._expensesOnCampus = 0;
	}
	
}