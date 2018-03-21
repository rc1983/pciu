package commonJavaLibraries.fileio;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCopyUsingApacheCommons
{

	public static void main(String[] args)
	{
		String sourceFile = "./src/commonJavaLibraries/files/loremipsum.txt";
		String targetFile = "./src/commonJavaLibraries/files/target.txt";
		
		File source = new File(sourceFile);
		File destination = new File(targetFile);
		
		try
		{
			System.out.println("Source file found at location: " + source.getAbsolutePath());
			FileUtils.copyFile(source, destination);
			System.out.println("Target file created at location: " + destination.getAbsolutePath());
		}
		catch (IOException e)
		{
			System.out.println("File not found.");
			e.printStackTrace();
		}

	}

}
