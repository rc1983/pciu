package olive.model.constants;

public class OliveModelConstants
{
	public static final String KALAMATA = "Kalamata";
	public static final String LIGURIAN = "Ligurian";
	
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
	
	public OliveModelConstants(String typeOfOlive, long color, double yeild)
	{
		super();
		this._typeOfOlive = typeOfOlive;
		this._color = color;
		this._yeild = yeild;
	}
	
	public OliveModelConstants()
	{
		super();
		this._typeOfOlive = "Kalamata";
		this._color = 0x2E0854;
		this._yeild = 3;
	}	
}