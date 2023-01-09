package j12_배열;

import java.util.Scanner;

public class J12_UserService {
	
	private Scanner scanner;
	private J12_UserRepository userRepository;
	
	public J12_UserService(J12_UserRepository userRepository) { // 객체가 생성되어야 스캐너 사용 
		scanner = new Scanner(System.in);
		this.userRepository = userRepository;
	}
	
	public void run() {
		boolean loopFlag = true;
		char select = '\0';
		
		while(loopFlag)	{
			showMainMenu();
			select = inputSelect("메인");
			loopFlag = mainMenu(select);
		}	
	}

	public void stop() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("프로그램 종료중...(" + (i + 1) + "/10)");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private char inputSelect(String menuName) {
		System.out.print(menuName + " 메뉴선택: ");
		char select =  scanner.next().charAt(0);
		scanner.nextLine(); // 버퍼 비워주기 
		return select;
	}
	
	private void showMainMenu() {
		System.out.println("========<<메인메뉴>>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 사용자 이름으로 회원 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}

	private void showUsers() {
		
		J12_User[] users = userRepository.getUserTable();
		
		System.out.println("========<< 회원 전체 조회 >>========");
		
		for(J12_User user : users) {
			System.out.println(user.toString());
		}
		
		System.out.println("====================================");
	}
	
	private void registerUser() {
		J12_User user = new J12_User();
		
		System.out.println("========<< 회원 등록 >>========");
		System.out.print("사용자이름: ");
		user.setUsername(scanner.nextLine());
		
		System.out.print("비밀번호: ");
		user.setPassword(scanner.nextLine());
		
		System.out.print("성명: ");
		user.setName(scanner.nextLine());
		
		System.out.print("이메일: ");
		user.setEmail(scanner.nextLine());
		
		userRepository.saveUser(user);
	}
	
	private void inquireUser() {
		System.out.print("사용자 이름을 입력하세요: ");
		String username = scanner.nextLine();
		J12_User user = userRepository.findUserByUsername(username);
		if(user == null) {
			System.out.println("존재하지 않는 사용자 이름입니다.");
			return; // 바로 빠져나감. 
		}
		System.out.println(user.toString());
	}
	
	private void modifyUserInfo() {
		
		System.out.print("수정 할 사용자이름을 입력하세요: ");
		String username = scanner.nextLine();
		J12_User user = userRepository.findUserByUsername(username);
		boolean loopFlag = true;
		char select = '\0';
		
		if(user==null) {
			
			System.out.println("해당 사용자이름은 존재하지 않는 사용자이름입니다.");
			return;
		} 
				
			while(loopFlag) {			
			System.out.println("========<< 수정메뉴 >>========");
			System.out.println("사용자이름: " + user.getUsername());
			System.out.println("==============================");
			System.out.println("1. 비밀번호 변경");
			System.out.println("2. 이름 변경");
			System.out.println("3. 이메일 변경");
			System.out.println("==============================");
			System.out.println("b. 뒤로가기");
			System.out.println();
			System.out.print("수정 메뉴 선택: " + select);
			modifyMenu(select);		
			}
		}
		
	

	private boolean mainMenu(char select) {
		boolean flag = true;
		
		if(isExit(select)) {
			flag = false;
			
		} else {
			if(select == '1') {
				showUsers();
			}else if(select == '2') {
				registerUser();
			}else if(select == '3') {
				inquireUser();
			}else if(select == '4') {
				modifyUserInfo();
			}else {
				 System.out.println(getSelectedErrorMessage());
			}
		}
		System.out.println();
		
		return flag;
	}
	
	private boolean modifyMenu(char select) {
		boolean flag = true;
		
		if(isBack(select)) {
			flag = false;
		} else {
			if(select == '1') {
				changePassword();
			}else if(select == '2') {
				
			}else if(select == '3') {
				
			}else {
				 System.out.println(getSelectedErrorMessage());
			}
		}
		System.out.println();
		
		return flag;
	}
	
	private void changePassword() {
		J12_User user = new J12_User();
		System.out.print("기존의 비밀번호를 입력하세요: ");
		String oldPassword = scanner.nextLine();
		
		if(oldPassword.equals(user.getPassword())) {
			System.out.print("새로운 비밀번호 입력하세요: ");
			user.setPassword(scanner.nextLine());
			System.out.print("새로운 비밀번호를 확인해주세요: ");
			String newPassword = scanner.nextLine();
			
			if(newPassword.equals(user.getPassword())) {
				System.out.println("비밀번호 변경 완료.");
			} else {
				System.out.println("비밀번호 서로 일치하지 않습니다.");
			}
			System.out.println();
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
	
	private boolean isBack(char select) {
		return select == 'b' || select == 'B';
	}

	private boolean isExit(char select) {
		return select == 'q' || select == 'Q';
	}
	
	private String getSelectedErrorMessage() {
		return "###<<잘못된 입력입니다. 다시 입력하세요.>>###";
	}
}