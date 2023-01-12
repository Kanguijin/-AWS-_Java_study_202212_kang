package j17_스태틱.싱글톤;

public class KIA {
	// 모든 싱글톤은 이렇게 만든다.
	private static KIA instance = null;
	
	private KIA() {} // 생성자가 private 바깥에서 호출불가 
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}
}
