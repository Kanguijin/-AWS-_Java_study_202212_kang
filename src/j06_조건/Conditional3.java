package j06_조건;

import java.util.Scanner;

public class Conditional3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score  = 0;
		String grade = null;
		
		System.out.println("성적 점수 입력: ");
		score = scanner.nextInt();
		
		/*
		 * 시험 성적을 학점으로 계산하는 프로그램 
		 * 
		 * 정수자료형 score변수 선언
		 * 88점으로 초기화 
		 * 
		 * 문자자료형 grade변수 선언 
		 * 
		 * 조건
		 * score가 0점보다 작거나 100점 초과 이면 계산불가 출력
		 * score가 90 ~ 100점이면 A학점
		 * score가 80 ~ 89점이면 B학점
		 * score가 70 ~ 79점이면 C학점
		 * score가 60 ~ 69점이면 D학점
		 * score가 0 ~ 59점이면 F학점
		 * 
		 * 플러스 학점 추가 
		 */
		
		if(score > 100 || score < 0) {
			System.out.println("계산불가");
		} else {
			
		if (score > 89) {
			grade = "A";
		} else if(score > 79) {
			grade = "B";
		} else if(score > 69) {
			grade = "C";
		} else if(score > 59) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		if(score % 10 > 4 && score > 59 || score == 100) {
			grade += "+";
		}
		
		System.out.println("점수(" + score + "): " + grade + "학점");
		
		}	
		
		
//		if (score > 100 || score < 0) {
//			grade = null;
//		} else if (score > 89) {
//			grade = "A";
//		} else if (score > 79) {
//			grade = "B";
//		} else if (score > 69) {
//			grade = "C";
//		} else if (score > 59) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
		
//		if ((score > 59 && score < 101) && (score % 10 > 4) || score == 100)) {
//			grade += "+";
//		}
		
//		if (grade == null) {
//			System.out.println("계산불가");
//		} else {
//			System.out.println("점수(" + score + "): " + grade + "학점");
//		} 강사님 코드 출력부 구분 
	}
}