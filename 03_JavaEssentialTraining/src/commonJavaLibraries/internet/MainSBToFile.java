package commonJavaLibraries.internet;

import java.net.MalformedURLException;

/**
 * This is the main method that will execute the application that will access a feed
 * and dump the contents into a specified file.</br>
 * 
 * Step 1: Access a URL</br>
 * Step 2: Read all the contents into a <b>StringBuilder</b> object</br>
 * Step 3: Call the static method that will accept a file path and the StringBuilder object</br>
 * Step 4: Write the contents of the StringBuilder object into the specified file</br>
 * 
 * @author Ravi
 *
 */

public class MainSBToFile
{
	private static final String FLOWERS_FEED = "http://services.hanselandpetal.com/feeds/flowers.xml";

	public static void main(String[] args) throws MalformedURLException
	{
		ReadDataIntoStringBuilder readData = new ReadDataIntoStringBuilder();
		
		StringBuilder sb = readData.readData(FLOWERS_FEED);
		
		String filePath = "./src/commonJavaLibraries/files/flowersFeed.xml";
		
		WriteStringBuilderToFile.writeToFile(filePath, sb);

	}

}
