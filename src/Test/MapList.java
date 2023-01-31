package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
class User {
	private String name;
	private String rating;
	private int age;
	
	public User(String name, String rating, int age) {
		this.name = name;
		this.rating = rating;
		this.age = age;
	}
}

public class MapList {
	
	public static void main(String[] args) {
		List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
		User user = new User("홍길동", "vip", 30);	
		User user2 = new User("김기영", "gold", 35);	
		
		Map map = new HashMap<>();
		map.put("홍길동", user);
		
		map.put("김기영", user2);
		
		customers.add(map);
			
		
		for(Map<String, Object> customer : customers) {
			
			User userInfo1 = (User)customer.get("홍길동");
			System.out.println("name=" + userInfo1.getName()
							+"\nrating=" + userInfo1.getRating()
							+"\nage=" + userInfo1.getAge());
			
			User userInfo2 = (User)customer.get("김기영");
			System.out.println("name=" + userInfo2.getName()
							+"\nrating=" + userInfo2.getRating()
							+"\nage=" + userInfo2.getAge());
		}
	}
}
