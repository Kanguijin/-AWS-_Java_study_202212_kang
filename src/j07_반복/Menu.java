package j07_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			String str = "강의진";
		
			System.out.println(str.charAt(0));
			
			System.out.println("========<<식당 메뉴>>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("========================");
			System.out.println("q. 프로그램 종료");
			System.out.println("========================");
			
			System.out.print("식당 번호 선택: ");
			
			select = scanner.next().charAt(0);
			
			if(select == 'q' || select == 'Q') {
				loopFlag1 = false;
			} else if(select == '1') {
				
				boolean loopFlag2 = true;
				
				while(loopFlag2) {					
					System.out.println();
					System.out.println("========<<김밥천국>>========");
					System.out.println("1. 라면");
					System.out.println("2. 볶음밥");
					System.out.println("3. 떡볶이");
					System.out.println("4. 쫄면");
					System.out.println("============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("c. 메뉴 선택 완료");
					System.out.println("============================");
					
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == 'c') {
		
					} else if (select == '1') {
						System.out.println("라면을 선택했습니다.");
						
					} else if (select == '2') {
						System.out.println("볶음밥을 선택했습니다.");
						
					} else if (select == '3') {
						System.out.println("떡볶이를 선택했습니다.");
						
					}  else if (select == '4') {
						System.out.println("쫄면을 선택했습니다.");
						
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					
					System.out.println();
			}
				
			} else if(select == '2') {
				boolean loopFlag2 = true;
				while(loopFlag2) {
					System.out.println();
					System.out.println("========<<탄탄면>>========");
					System.out.println("1. 탄탄면");
					System.out.println("2. 스시");
					System.out.println("3. 우동");
					System.out.println("4. 후토마키");
					System.out.println("============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("============================");
					
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println("탄탄면을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("스시를 선택했습니다.");
					} else if (select == '3') {
						System.out.println("우동을 선택했습니다.");
					}  else if (select == '4') {
						System.out.println("후토마키를 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}	
					
					System.out.println();
				}		
			} else if(select == '3') {
				boolean loopFlag2 = true;
				while(loopFlag2) {
					System.out.println();
					System.out.println("========<<홍대개미>>========");
					System.out.println("1. 연어덮밥");
					System.out.println("2. 스테이크덮밥");
					System.out.println("3. 가츠동");
					System.out.println("4. 우동");
					System.out.println("============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("============================");
					
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println("연어덮밥을 선택했습니다.");
					} else if (select == '2') {
						System.out.println("스테이크덮밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("가츠동을 선택했습니다.");
					}  else if (select == '4') {
						System.out.println("우동을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}	
					
					System.out.println();
				}	
			} else if(select == '4') {
				boolean loopFlag2 = true;
				while(loopFlag2) {
					System.out.println();
					System.out.println("========<<밥앤밥>>========");
					System.out.println("1. 떡볶이");
					System.out.println("2. 김밥");
					System.out.println("3. 김치찌개");
					System.out.println("4. 순두부찌개");
					System.out.println("============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("============================");
					
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
					
					if (select == 'b') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println("떡볶이를 선택했습니다.");
					} else if (select == '2') {
						System.out.println("김밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println("김치찌개를 선택했습니다.");
					}  else if (select == '4') {
						System.out.println("순두부찌개를 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}	
					
					System.out.println();
				}	
			} else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 정상 종료!");
	
	}
}