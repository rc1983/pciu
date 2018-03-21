package olive.model.abstractClass;

public enum OliveNamesAbstract
{
	KALAMATA("Kalamata"),LIGURIAN("Ligurian"),UNKNOWN("Unknown");
	
	private String _typeOfOlive;
	
//	We cannot use the public keyword because a constructor for an enum, it can only be called by 
//	itself
	OliveNamesAbstract(String typeOfOlive)
	{
		this._typeOfOlive = typeOfOlive;
	}

//	public String getTypeOfOlive()
//	{
//		return _typeOfOlive;
//	}
//
//	public void setTypeOfOlive(String typeOfOlive)
//	{
//		this._typeOfOlive = typeOfOlive;
//	}
	
//	This override method is needed to print the value instead of the identifier
	@Override
	public String toString()
	{
		return _typeOfOlive;
	}
}
