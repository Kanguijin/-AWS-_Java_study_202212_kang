package j04_연산자;
/*
 *  논리연산자  0과 1을 가지고 계산하는 것, 거짓이 아니면 무조건 참이다, 0이 아니면 무조건 참이다. 
 * 
 * AND(곱) T && T, T && F 조건 중 하나라도 0이면 0이다. EX)멤버쉽 
 * 
 * OR(합) T || F 하나만 참이라도 참(또는) 
 * 
 * NOT(부정) !T 
 */
 
public class Operation3 {
	public static void main(String[] args) {
		
		int num = 11;
		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = num % 2 == 0;
		
		System.out.println(flag1 && flag2);
		System.out.println(flag1 && flag3);
		System.out.println(!(flag1 || flag3 && flag1));
		
		
	}
}
