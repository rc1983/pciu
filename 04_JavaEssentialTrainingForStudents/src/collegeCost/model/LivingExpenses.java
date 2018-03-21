package collegeCost.model;

@Deprecated
public class LivingExpenses
{
	private boolean _livingInDorm;
	private double _dormFees;
	private double _costOfMealPlan;
	private int _durationOfStayInDorm;
	private double _rent;
	private double _otherExpenses;
	
	public LivingExpenses(double dormFees, double costOFMealPlan, int durationOfStayInDorm, double otherExpenses)
	{
		super();
		this._livingInDorm = true;
		this._dormFees = dormFees;
		this._costOfMealPlan = costOFMealPlan;
		this._durationOfStayInDorm = durationOfStayInDorm;
		this._rent = 0;
		this._otherExpenses = otherExpenses;
	}
	
	public LivingExpenses(double rent, double otherExpenses)
	{
		super();
		this._livingInDorm = false;
		this._dormFees = 0;
		this._costOfMealPlan = 0;
		this._durationOfStayInDorm = 0;
		this._rent = rent;
		this._otherExpenses = otherExpenses;
	}
	
	public boolean isLivingInDorm()
	{
		return _livingInDorm;
	}

	public double getDormFees()
	{
		return _dormFees;
	}

	public double getCostOfMealPlan()
	{
		return _costOfMealPlan;
	}
	
	public int getDurationOfStayInDorm()
	{
		return _durationOfStayInDorm;
	}

	public double getRent()
	{
		return _rent;
	}

	public double getOtherExpenses()
	{
		return _otherExpenses;
	}

	public void setIsLivingInDorm(boolean isLivingInDorm)
	{
		this._livingInDorm = isLivingInDorm;
	}

	public void setDormFees(double dormFees)
	{
		this._dormFees = dormFees;
	}

	public void setCostOfMealPlan(double costOfMealPlan)
	{
		this._costOfMealPlan = costOfMealPlan;
	}
	
	public void setDurationOfStayInDorm(int durationOfStayInDorm)
	{
		this._durationOfStayInDorm = durationOfStayInDorm;
	}
	
	public void setRent(double rent)
	{
		this._rent = rent;
	}

	public void setOtherExpenses(double otherExpenses)
	{
		this._otherExpenses = otherExpenses;
	}
	
	public double totalLivingExpenses()
	{
		double totalLivingExpenses = 0;
		
		if (_livingInDorm)
		{
			totalLivingExpenses = (_dormFees + _costOfMealPlan) * 12 + _otherExpenses;
		}
		else
		{
			totalLivingExpenses = (_rent * 12) + _otherExpenses;
		}
		
		return totalLivingExpenses;
	}
}