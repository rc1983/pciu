package olive.operations;

import java.util.List;

import olive.model.enums.OliveModelEnums;

/**
 * This class is unnecessary because olive.operations.OlivePress
 * handles all List input parameters
 * 
 * @author Patch
 *
 */

public class OlivePressEnums
{
	public double getOil(List<OliveModelEnums> olives)
	{
		double yeild = 0; 
		for (OliveModelEnums olive : olives)
		{
			yeild += olive.getYeild();
		}
		
		return yeild;
	}
}
