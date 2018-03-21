package olive.model.enums;

public enum OliveColorEnums
{
	PURPLE("Purple"), BLACK("Black"), GREEN("Green");
	
	private String _oliveColor;

	private OliveColorEnums(String oliveColor)
	{
		this._oliveColor = oliveColor;
	}
	
	public String getOliveColor()
	{
		return _oliveColor;
	}

	public void setOliveColor(String oliveColor)
	{
		this._oliveColor = oliveColor;
	}
	
	@Override
	public String toString()
	{
		return _oliveColor;
	}
	
}
