package j08_메소드;

public class Method3 {
	
	// 메소드 오버로딩(오버로드)OverLoad 부를 때 쓰는 것 오버라이딩은 덮어쓰는 것. 
	// 불러들일 때 어떤 메서드를 사용할 지 결정하기 때문에 리턴값은 상관없음. 
	
	public static void ov1() {
		System.out.println("매개변수 없음");
	}
	
	public static void ov1(int a) {
		System.out.println("int 매개변수 하나");
	}
	
	public static void ov1(int a, String b) {
		System.out.println("int 먼저 그다음 String");
	}
	
	public static void ov1(String a, int b) {
		System.out.println("String 먼저 그다음 int");
	}
	
	public static void main(String[] args) {
		ov1();
		ov1(10);
	}

}
