package commonJavaLibraries.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NewIO
{

	public static void main(String[] args)
	{
		Path sourceFile = Paths.get("./src/commonJavaLibraries/files", "loremipsum.txt");
		Path targetFile = Paths.get("./src/commonJavaLibraries/files", "target.txt");
		
		try
		{
			System.out.println("Source file found at location: " + sourceFile.toAbsolutePath());
			Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Target file created at location: " + targetFile.toAbsolutePath());
		}
		catch (IOException e)
		{
			System.out.println("File not found.");
			e.printStackTrace();
		}
	}

}
