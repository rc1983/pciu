package datesAndTimes;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;

public class datesAndTimes
{
	public static void main(String[] args)
	{
		Date d = new Date();
		
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		
		GregorianCalendar gcal = new GregorianCalendar(2009,1,28);
		System.out.println(gcal.after(cal));
		
		gcal.add(GregorianCalendar.DATE, 1);
		
		Date d2 = gcal.getTime();
		
		System.out.println(d2);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(df.format(d2));
		
//		This is new API
		LocalDateTime ldt = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtfIso = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter dtfPattern = DateTimeFormatter.ofPattern("MM/d/yyyy");
		
		System.out.println("LocalDateTime, ldt: " + ldt.format(formatter));
		
		LocalDate ld = LocalDate.of(2009, 1, 28);
		
		System.out.println("LocalDate No Format, ld: " + ld);
		System.out.println("LocalDate, ld: " + ld.format(formatter));
		System.out.println("LocalDate ISO, ld: " + ld.format(dtfIso));
		System.out.println("dftIso.format(ld): " + dtfIso.format(ld));
		System.out.println("dtfPattern.format(ld): " + dtfPattern.format(ld));
		
		
		
	}
}
