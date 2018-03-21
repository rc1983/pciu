package olive;

import java.util.ArrayList;
import java.util.List;

import olive.model.abstractClass.KalamataAbstract;
import olive.model.abstractClass.LigurianAbstract;
import olive.model.abstractClass.OliveModelAbstract;
import olive.operations.OlivePress;
import olive.operations.interfaces.Press;

public class OliveMainAbstract
{

	public static void main(String[] args)
	{
		List<OliveModelAbstract> olives = new ArrayList<>();
		
		olives.add(new KalamataAbstract());
		olives.add(new KalamataAbstract());
		olives.add(new KalamataAbstract());
		olives.add(new KalamataAbstract());
		olives.add(new LigurianAbstract());
		olives.add(new LigurianAbstract());
		
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
