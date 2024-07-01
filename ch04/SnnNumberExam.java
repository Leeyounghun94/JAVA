package ch04;

import java.util.Scanner;

public class SnnNumberExam {

	public static void main(String[] args) {
		// 주민번호 활용 코드
		
		
	System.out.println("주민등록번호를 입력해주세요(-생략) : ");
	Scanner in = new Scanner (System.in);
	
	String ssn = in.next();
	
	char ssn2 = ssn.charAt(6);	// -> charAt =  String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해줌(= 6번째 문자)
	int num = Character.getNumericValue(ssn2); // -> getnumbericvalue = 숫자 형태의 char형을 int타입으로 변환.
	
	
	if (num % 2 == 0 ) {
		System.out.println("여자");
	} else if (num % 2 ==1) {
		System.out.println("남자");
	} else {
		System.out.println(" 다시 작성해 주세요 ");	
	}
	
	int year = Integer.parseInt(ssn.substring(0,2)); // -> parseInt()는 문자열 String타입의 숫자를 int타입으로 변환해줌
		
	
	
	
	

	}

}
