package olive.operations;

import java.util.List;

import olive.model.OliveModel;
import olive.model.abstractClass.OliveModelAbstract;
import olive.model.enums.OliveModelEnums;
import olive.operations.interfaces.Press;

public class OlivePress implements Press
{
	private double _oil;
	public double getOil(List<?> oliveModels)
	{
		Object object = oliveModels.get(0);

		double yeild = _oil;

		if (object instanceof OliveModelEnums)
		{
			List<OliveModelEnums> olives = (List<OliveModelEnums>) oliveModels;

			for (OliveModelEnums olive : olives)
			{
				yeild += olive.getYeild();
			}
		}

		else if (object instanceof OliveModel)
		{
			List<OliveModel> olives = (List<OliveModel>) oliveModels;

			for (OliveModel olive : olives)
			{
				yeild += olive.getYeild();
			}
		}
		
		else if (object instanceof OliveModelAbstract)
		{
			List<OliveModelAbstract> olives = (List<OliveModelAbstract>) oliveModels;

			for (OliveModelAbstract olive : olives)
			{
				yeild += olive.getYeild();
			}
		}

		return yeild;
	}

	@Override
	public void setOil(double oil)
	{
		_oil = oil;
	}

	@Override
	public double getCurrentOil()
	{
		return _oil;
	}
}
