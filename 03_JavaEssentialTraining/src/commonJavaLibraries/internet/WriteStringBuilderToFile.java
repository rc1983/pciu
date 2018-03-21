package commonJavaLibraries.internet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteStringBuilderToFile
{
	public static void writeToFile(String filePath, StringBuilder sb)
	{
		File f = new File(filePath);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f)))
		{
			bw.append(sb);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
