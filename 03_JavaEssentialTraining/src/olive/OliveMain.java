package olive;

import java.util.ArrayList;
import java.util.List;

import olive.model.OliveModel;
import olive.operations.OlivePress;

public class OliveMain
{

	public static void main(String[] args)
	{
		
		List<OliveModel> oliveModels = new ArrayList<>();
		
//		Olive o1 = new Olive("Kalamata", 0x2E0854, 3);
//		Olive o2 = new Olive("Kalamata", 0x2E0854, 4);
//		Olive o3 = new Olive("Kalamata", 0x2E0854, 5);
		
		oliveModels.add(new OliveModel("Kalamata", 0x2E0854, 3));
		oliveModels.add(new OliveModel("Kalamata", 0x2E0854, 4));
		oliveModels.add(new OliveModel("Kalamata", 0x2E0854, 5));
		
		for (OliveModel oliveModel : oliveModels)
		{
			System.out.println(oliveModel.getTypeOfOlive());
			System.out.println(oliveModel.getColor());
			System.out.println(oliveModel.getYeild());
		}
		
		OlivePress op = new OlivePress();
		
		double yeild = op.getOil(oliveModels);
		System.out.println("The yeild is: " + yeild);
		
	}

}
