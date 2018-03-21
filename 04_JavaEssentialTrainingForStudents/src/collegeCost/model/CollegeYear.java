package collegeCost.model;

public enum CollegeYear
{
	FRESHMAN("Freshmen"), SOPHOMORE("Sophmore"), JUNIOR("Junior"), SENIOR("Senior");
	
	private String _collegeYear;
	
	CollegeYear(String collegeYears)
	{
		this._collegeYear = collegeYears; 
	}
	
	public String toString()
	{
		return _collegeYear;
	}
}
