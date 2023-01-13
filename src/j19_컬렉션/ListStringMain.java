package j19_컬렉션;

import java.util.ArrayList;

public class ListStringMain {
						
	public static void main(String[] args) {
		String[] strArray = new String[] {"java", "python", "C++"};
		String[] strArray1 = new String[strArray.length+1];
		
		System.out.println("[strArray]");
		for(String str : strArray) {
			System.out.println(str);
		}
		System.out.println();
		
		for(int i = 0; i < strArray.length; i++) {
			strArray1[i] = strArray[i];
		}
		strArray1[strArray.length] = "html";
		
		System.out.println("[newStrArray]");
		for(String str : strArray1) {
			System.out.println(str);
		}
		///////////////////////////////////////////////////
		ArrayList<String> strList = new ArrayList<>();
		strList.add("java");
		strList.add("python");
		strList.add("python");
		strList.add("python");
		strList.add("python");
		strList.add("python");
		strList.remove("java");
		strList.add(1, "java");
		strList.remove(1);
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.print("[" + i + "]: ");
			System.out.println(strList.get(i));
		}
		
		for(String str : strList) {
			System.out.println(str);
		}
	}

}
