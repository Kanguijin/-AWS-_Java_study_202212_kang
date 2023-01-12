package j17_스태틱;

import java.time.LocalDateTime;

public class Car {
	
	private static final int NOW_YEAR = LocalDateTime.now().getYear();
	
	private static final String CODE = "KIA-" + NOW_YEAR + "-"; 
	private static int ai = 1;
	
	private String serialCode; // KIA-2023-0000
	private String modelName;
	
	public Car(String modelName) {
		serialCode = CODE + String.format("%04d", ai);
		this.modelName = modelName;
		ai++;
	}

	@Override
	public String toString() {
		return "Car [serialCode = " + serialCode + ", modelName = " + modelName + "]";
	}
	
	
}
