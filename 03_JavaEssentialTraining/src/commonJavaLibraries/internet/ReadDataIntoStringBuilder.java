package commonJavaLibraries.internet;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadDataIntoStringBuilder
{
	public StringBuilder readData(String urlStr) throws MalformedURLException
	{
		URL url = new URL(urlStr);
		StringBuilder sb = new StringBuilder();
		
		try (InputStream inputStream = url.openStream())
		{
			
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			int data = bufferedInputStream.read();
			
			while(data != -1)
			{
				char c = (char)data;
				sb.append(c);
				data = bufferedInputStream.read();
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return sb;
	}
}
