package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

//@NoArgsConstructor // 기본 생성자 
//@RequiredArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@AllArgsConstructor // 전체 생성자 
@Data
public class Student {
	private String name; 
	private int year;
//	private final String address;
}
