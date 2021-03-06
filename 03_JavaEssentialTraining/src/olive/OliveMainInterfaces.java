package olive;

import java.util.ArrayList;
import java.util.List;

import olive.model.enums.KalamataEnums;
import olive.model.enums.LigurianEnums;
import olive.model.enums.OliveModelEnums;
import olive.operations.OlivePress;
import olive.operations.interfaces.Press;

public class OliveMainInterfaces
{

	public static void main(String[] args)
	{
		List<OliveModelEnums> olives = new ArrayList<>();
		
		olives.add(new KalamataEnums());
		olives.add(new KalamataEnums());
		olives.add(new LigurianEnums());
		olives.add(new LigurianEnums());
		olives.add(new LigurianEnums());
		olives.add(new LigurianEnums());
		
		OlivePress op = new OlivePress();
		double yield = op.getOil(olives);
		System.out.println("Current oil: " + op.getCurrentOil());
		System.out.println("Yield : " + yield);
		
		
		Press press = new OlivePress();
		press.setOil(10);
		System.out.println("Current oil: " + press.getCurrentOil());
		System.out.println("Yeild = " + press.getOil(olives));
	}
}
