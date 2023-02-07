package j19_컬렉션;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapStringMain {

	public static void main(String[] args) {
		Map<String, String> strMap  = new HashMap<>();
		
		strMap.put("이종현", "a");
		strMap.put("진채희", "b");
		strMap.put("김재영", "c");
		strMap.put("이상현", "d");
		
		System.out.println(strMap);
		
		
		System.out.println(strMap.get("a"));
		
		for(String k : strMap.keySet())	 {
			System.out.println("key: " + k);
			System.out.println(strMap.get(k));
		}
		
		for(String v : strMap.values()) {
			System.out.println("value: " + v);
		}
		for(Entry<String,String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
			System.out.println();
		}
		
		strMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
	}

}
