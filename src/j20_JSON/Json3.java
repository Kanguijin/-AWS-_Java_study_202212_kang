package j20_JSON;

import com.google.gson.Gson;

public class Json3 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		gson.toJson(null); 				// Object -> json
		gson.fromJson("",Object.class); // json -> Object
	
	}

}
