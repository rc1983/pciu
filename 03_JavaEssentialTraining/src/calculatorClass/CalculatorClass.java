package calculatorClass;

import java.util.ArrayList;

import calculatorClass.operations.InputHelper;
import calculatorClass.operations.MathHelper;

public class CalculatorClass {

	public static void main(String[] args) 
	{
		ArrayList<String> listOfNumbers = InputHelper.getInput(8);
		MathHelper.performOperation(listOfNumbers);
	}

}
