package j12_배열;

public class Array5 {
	
	public static void transferArray(int[] oldArray, int[] newArray) {
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	}	
	
	public static int[] addArrayLength(int[] array) {
		int[] newArray = new int[array.length+1];
		transferArray(array, newArray);
		return newArray;
	}
	// 클린코드 - 메서드명만 보고도 동작을 확신할 수 있게해야함. 
	// 결합도는 낮고 응집도는 높아야한다. 인터페이스 
	public static int[] addData(int[] array, int data) {
		int[] newArray = addArrayLength(array);
		newArray[array.length] = data; 
		return newArray;
	}
	
	public static void main(String[] args) {
		
		int[] nums = new int[0];
		
		nums = addData(nums, 1);
		nums = addData(nums, 2);
		nums = addData(nums, 3);
		nums = addData(nums, 4);
		nums = addData(nums, 5);

		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
}
