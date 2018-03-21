package olive.model;

public class OliveModel
{
	private String _typeOfOlive;
	private long _color;
	private double _yeild;
	
	public String getTypeOfOlive()
	{
		return _typeOfOlive;
	}
	public long getColor()
	{
		return _color;
	}
	public double getYeild()
	{
		return _yeild;
	}
	public void setTypeOfOlive(String typeOfOlive)
	{
		this._typeOfOlive = typeOfOlive;
	}
	public void setColor(long color)
	{
		this._color = color;
	}
	public void setYeild(double yeild)
	{
		this._yeild = yeild;
	}
	
	public OliveModel(String typeOfOlive, long color, double yeild)
	{
		super();
		this._typeOfOlive = typeOfOlive;
		this._color = color;
		this._yeild = yeild;
	}
	
	public OliveModel()
	{
		super();
		this._typeOfOlive = "Kalamata";
		this._color = 0x2E0854;
		this._yeild = 3;
	}	
}