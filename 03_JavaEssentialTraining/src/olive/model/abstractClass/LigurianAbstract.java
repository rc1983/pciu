package olive.model.abstractClass;

public class LigurianAbstract extends OliveModelAbstract
{
	public LigurianAbstract() 
	{
		super(OliveNamesAbstract.LIGURIAN,OliveColorAbstract.BLACK,5);
	}

	@Override
	public String getOrigin()
	{
		// TODO Auto-generated method stub
		return "Italy";
	}
}
