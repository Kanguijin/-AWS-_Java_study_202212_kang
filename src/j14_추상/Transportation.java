package j14_추상;

// 추상 = 공통된 것을 묶어놓은 것.
// 클래스 안에 추상 메서드가 하나라도 존재하면 추상클래스로 정의해야한다.
// 생성불가 
public abstract class Transportation {
	
	// 추상 메소드(구현부가 없음) 
	public abstract void go();
	
	public abstract void stop();
	
}
