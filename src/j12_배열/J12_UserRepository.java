package j12_배열;

// 저장소	
public class J12_UserRepository {
	
	private J12_User[] userTable;

	public J12_UserRepository(J12_User[] userTable) {
		this.userTable = userTable;
	}
	
	public J12_User[] getUserTable() {
		return userTable;
	}
	
	public void saveUser(J12_User user) {
		extendArrayOne();
		userTable[userTable.length - 1] = user;
	}
	
	private void extendArray(int length) {
		J12_User[] newArray = new J12_User[userTable.length + length];
		transferDataToNewArray(userTable, newArray);
	}
	
	private void extendArrayOne() {
		J12_User[] newArray = new J12_User[userTable.length + 1];
		transferDataToNewArray(userTable, newArray);
		userTable = newArray;
	}
	
	public void transferDataToNewArray(J12_User[] oldArray, J12_User[] newArray) {
		for(int i  = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}	
	
	public J12_User findUserByUsername(String username) {
		
		J12_User user = null;
		
		for(J12_User u : userTable) {
			if(u == null) { // 객체는 널체크해야한다. 
				continue; // 다음반복으로 넘어가라 
			}
			if(u.getUsername().equals(username)) {
				user = u;
				break;
			} 
			
		}
		return user;
		
	}
	
	/*
	 * 
	 * 1. 사용자이름으로 조회
	 * 
	 * 2. 회원 정보 수정
	 * 
	 * 		1. 비밀번호 변경
	 * 		2. 이름 변경
	 * 		3. 이메일 변경	
	 * 
	 * 		b. 뒤로가기 
	 */
	
}
