package collegeCost.model;

public class Student
{
	private String _name;
	private CollegeYear _collegeYear;
	private boolean _onCampus;
	
	
	public String getName()
	{
		return _name;
	}
	public CollegeYear getCollegeYear()
	{
		return _collegeYear;
	}
	public boolean isOnCampus()
	{
		return _onCampus;
	}
	public void setName(String name)
	{
		this._name = name;
	}
	public void setCollegeYear(CollegeYear collegeYear)
	{
		this._collegeYear = collegeYear;
	}
	public void setOnCampus(boolean onCampus)
	{
		this._onCampus = onCampus;
	}
}
