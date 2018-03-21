package olive.model.abstractClass;



public abstract class OliveModelAbstract
{
	private OliveNamesAbstract _typeOfOlive;
	private OliveColorAbstract _color;
	private double _yeild;

	public OliveNamesAbstract getTypeOfOlive()
	{
		return _typeOfOlive;
	}
	public OliveColorAbstract getColor()
	{
		return _color;
	}
	public double getYeild()
	{
		System.out.println("The olive is from: " + getOrigin());
		System.out.println("The tyoe pf olive is: " + _typeOfOlive);
		System.out.println("The yeild is: " + _yeild);
		return _yeild;
	}
	public void setTypeOfOlive(OliveNamesAbstract typeOfOlive)
	{
		this._typeOfOlive = typeOfOlive;
	}
	public void setColor(OliveColorAbstract color)
	{
		this._color = color;
	}
	public void setYeild(double yeild)
	{
		this._yeild = yeild;
	}

	public OliveModelAbstract(OliveNamesAbstract kalamata, OliveColorAbstract purple, double yeild)
	{
		super();
		this._typeOfOlive = kalamata;
		this._color = purple;
		this._yeild = yeild;
	}

	public OliveModelAbstract()
	{
		super();
		this._typeOfOlive = OliveNamesAbstract.KALAMATA;
		this._color = OliveColorAbstract.BLACK;
		this._yeild = 3;
	}

	public OliveModelAbstract(OliveNamesAbstract typeOfOlive)
	{
		super();
		this._color = OliveColorAbstract.BLACK;
		this._yeild = 3;
	}
	
	public abstract String getOrigin();
}