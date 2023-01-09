package j12_배열.di;

public class Test_A {
	
	private final Test_B tb; // 부품 교체 필요 시 final 해제 
	
	public Test_A(Test_B tb) { // required-argument(매개변수) constructor no-argument all-argument 
		this.tb = tb;
	}
	
//	public void setTb(Test_B tb) {
//		this.tb = tb;
//	}
	
	public void testA1() {
		System.out.println("테스트A1 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		tb.tetsB1();
	}
	
	public void testA2() {
		System.out.println("테스트A2 메소드 호출!!");
//		Test_B tb = new Test_B();
		
		tb.tetsB1();
	}
}
