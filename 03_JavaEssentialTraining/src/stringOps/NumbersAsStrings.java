package stringOps;

import java.text.NumberFormat;
import java.util.Locale;

public class NumbersAsStrings
{

	public static void main(String[] args)
	{
		double doubleValue = 1_234_56.78;
		
		NumberFormat numF = NumberFormat.getNumberInstance();
		
		System.out.println("Number: " + numF.format(doubleValue));
		
		Locale locale = new Locale("da", "DK");
		
		NumberFormat numFormatDK = NumberFormat.getInstance(locale);
		System.out.println("Number: " + numFormatDK.format(doubleValue));
		
		NumberFormat curF = NumberFormat.getCurrencyInstance();
		System.out.println("Currency: " + curF.format(doubleValue));
		
		NumberFormat curFormatDK = NumberFormat.getCurrencyInstance(locale);
		System.out.println("Currency: " + curFormatDK.format(doubleValue));
		
		NumberFormat intF = NumberFormat.getIntegerInstance();
		System.out.println("Integer: " + intF.format(doubleValue));
		
		NumberFormat intFormatDK = NumberFormat.getIntegerInstance(locale);
		System.out.println("Integer: " + intFormatDK.format(doubleValue));

	}

}
