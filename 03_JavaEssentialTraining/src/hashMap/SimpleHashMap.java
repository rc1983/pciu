package hashMap;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap
{

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		
		map.put("a", "b");
		map.put("c", "d");
		map.put("e", "f");
		map.put("g", "h");
		
		for(int i = 0; i < 100; i++)
		{
			System.out.println(map);
			
			if (i == 50)
			{
				map.put("i", "j");
			}
		}
		
		String value = map.get("a");
		System.out.println(value);
		
		map.remove("a");
		System.out.println(map);
		
	}

}
