package j03_형변환;

public class Casting2 {

	public static void main(String[] args) {
		char char_a = 'a';
		int num = (int) char_a; //  Up-casting은 형변환 생략가능, 묵시적 형변환 
		
		char char_b = (char)(num+1); // Down-casting은 형변환 생략불가, 명시적 형변환
		
		System.out.println('a'+1);
		System.out.println(char_b);
	}

}
