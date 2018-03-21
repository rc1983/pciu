package commonJavaLibraries.internet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 
 * The goal of this class is to access the URL and read all the XML data into a StringBuilder object
 * Then we will take all the data from the StringBuilder object and write the contents to a file
 * 
 * @author Patch-
 *
 */

public class InternetMain
{
	private static final String FLOWERS_FEED = "http://services.hanselandpetal.com/feeds/flowers.xml";
	
	public static void main(String[] args) throws IOException
	{
		InputStream is = null;
		BufferedInputStream bis = null;
		try
		{
			URL url = new URL(FLOWERS_FEED);
			is = url.openStream();
			bis = new BufferedInputStream(is);
			StringBuilder sb = new StringBuilder();
			
			int data = bis.read();
			
			while(data != -1)
			{
				char c = (char)data;
				sb.append(c);
				data = bis.read();
			}
			
//			while(true)
//			{
//				int data = bis.read();
//				if(data == -1)
//				{
//					break;
//				}
//				else
//				{
//					char c = (char)data;
//					sb.append(c);
//				}
//			}
			
			System.out.println(sb);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			is.close();
			bis.close();
		}

	}
}