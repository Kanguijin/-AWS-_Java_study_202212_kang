package j03_형변환;

public class Casting3 {

	public static void main(String[] args) {
		double kor = 87.5;
		double eng  = 95.7;
		double math = 80.5;

		int total = (int) kor + (int) eng + (int) math; // 코드의 가독성을 높이자 띄어쓰기
		double avg = (double) total / 3.0; // 자료형이 다르면 연산할 수 없다. 자동으로 묵시적 형변환 int->double 
	
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
		
	}
}
