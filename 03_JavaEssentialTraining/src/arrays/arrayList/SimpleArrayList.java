package arrays.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayList
{

	public static void main(String[] args)
	{
		
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list);
		
		list.add("d");
		list.remove(0);
		
		System.out.println(list);
		
		String storeValue = list.get(0);
		System.out.println(storeValue);
		
		int position = list.indexOf("b");
		System.out.println(position);
		
	}

}
