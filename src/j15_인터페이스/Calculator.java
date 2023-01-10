package j15_인터페이스;

public interface Calculator {
	// 변수는 못가지고 상수만 가질 수 있다.
	// final 생략가능
	public int ERROR = -9999999;
	// 인터페이스 안에는 abstract가 생략
	// 생성하는 용도가 아니다. 
	public double plus(double x, double y);
	
	public double minus(double x, double y);
	
	// default를 적어야 일반 메소드 사용가능
	public default double multiplication(double x, double y) {
		return x * y;
	}
	
	public double division(double x, double y);
		
}
