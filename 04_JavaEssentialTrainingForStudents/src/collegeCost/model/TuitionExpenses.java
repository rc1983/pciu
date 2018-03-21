package collegeCost.model;

@Deprecated
public class TuitionExpenses
{
	private int _numberOfCreditHoursPerYear;
	private double _costOfCreditHour;
//	This includes text books
	private double _costOfSuppliesPerYear;
	
	public TuitionExpenses(int numberOfCreditHoursPerYear, double costOfCreditHour, double costOfSuppliesPerYear)
	{
		super();
		this._numberOfCreditHoursPerYear = numberOfCreditHoursPerYear;
		this._costOfCreditHour = costOfCreditHour;
		this._costOfSuppliesPerYear = costOfSuppliesPerYear;
	}

	public int getNumberOfCreditHoursPerYear()
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
	
	public double totalTuitionExpenses()
	{
		double totalTuitionExpenses = 0;
		
		totalTuitionExpenses = (_numberOfCreditHoursPerYear * _costOfCreditHour) + _costOfSuppliesPerYear;
		
		return totalTuitionExpenses;
	}
}