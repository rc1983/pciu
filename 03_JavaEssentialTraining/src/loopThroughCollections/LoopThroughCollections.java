package loopThroughCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LoopThroughCollections
{
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		List<String> list = putElementsInList(3);
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		iterateOverArrayList(list);
		
//		Map<String, String> map = putElementsInMap(3);
		Map<String, String> map = new HashMap<>();
		map.put("abc1", "123");
		map.put("abc2", "456");
		map.put("abc3", "789");
		iterateOverHashMap(map);
		
	}
	
	public static void iterateOverArrayList(List<String> list)
	{
		System.out.println("toString()");
		System.out.println(list);
		
		System.out.println("Iterator");
		Iterator<String> iterator = list.iterator(); 
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + ", ");
		}
		
		System.out.println("\nFor each");
		for(String value : list)
		{
			System.out.print(value + ", ");
		}
		
		System.out.println("Java 8 Method Reference");
		list.forEach(System.out :: println);
		
	}
	
	public static List<String> putElementsInList(int numberOfElements)
	{
		List<String> listOfStrings = new ArrayList<String>();
		
		for(int i = 0; i < numberOfElements; i++)
		{
			System.out.print("Enter an element: ");
			listOfStrings.add(input.nextLine());
		}
		
		return listOfStrings;
	}
	
	public static void iterateOverHashMap(Map<String, String> map)
	{
		System.out.println("toString()");
		System.out.println(map);
		
		System.out.println("Hash map iterator");
//		Unique set to keys to iterate over
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext())
		{
			String key = iterator.next();
			System.out.println("Key: " + key + "; Value: " + map.get(key));
		}
		
		System.out.println("HashMap ForEach");
		for(String key : keys)
		{
			System.out.println("Key: " + key + "; Value: " + map.get(key));
		}
		
	}
	
	public static Map<String, String> putElementsInMap(int numberOfElementsInMap)
	{
		Map<String, String> mapOfStrings = new HashMap<String, String>();
		
		for (int i = 0; i < numberOfElementsInMap; i++)
		{
			System.out.print("Enter key: ");
			String key = input.nextLine();
			System.out.println("Enter value: ");
			String value = input.nextLine();
			mapOfStrings.put(key, value);
		}
		
		return mapOfStrings;
	}
}