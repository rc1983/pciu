package olive;

import java.util.ArrayList;
import java.util.List;

import olive.model.enums.OliveNamesEnums;
import olive.operations.OlivePressEnums;
import olive.model.enums.OliveColorEnums;
import olive.model.enums.OliveModelEnums;

public class OliveMainEnums
{
	public static void main(String[] args)
	{
		List<OliveModelEnums> olives = new ArrayList<>();
		
		olives.add(new OliveModelEnums(OliveNamesEnums.KALAMATA, OliveColorEnums.BLACK, 3));
		olives.add(new OliveModelEnums(OliveNamesEnums.LIGURIAN, OliveColorEnums.GREEN, 4));
		olives.add(new OliveModelEnums(OliveNamesEnums.UNKNOWN, OliveColorEnums.PURPLE, 5));
		
		for (OliveModelEnums olive : olives)
		{
			System.out.println(olive.getTypeOfOlive());
			System.out.println(olive.getColor());
			System.out.println(olive.getYeild());
		}
		
		OlivePressEnums ope = new OlivePressEnums();
		
		double yeild = ope.getOil(olives);
		System.out.println("The yeild is: " + yeild);
		
		OliveNamesEnums name = OliveNamesEnums.KALAMATA;
		System.out.println(name);
	}
}
