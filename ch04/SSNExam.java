package ch04;

import java.util.Scanner;

public class SSNExam {

	public static void main(String[] args) {
		// 주민번호 7번째 글자를 일력 받아 남,여 파악용
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("주민번호 7번째 숫자 입력 : ");
		
		int ssn = input.nextInt();

		
		
		if(ssn == 1) {
		System.out.println("1 = 남자");
		
	} else if (ssn == 2) {
		System.out.println("2 = 여자");
		
	} else if (ssn == 3) {
		System.out.println("3 = 2000년생 이후 남자");

	} else if (ssn == 4) {
		System.out.println("4 = 2000년생 이후 여자");

	} else if (ssn == 5) {
		System.out.println("5 = 외국인 남자");
	}
	else if (ssn == 6) {
		System.out.println("6= 외국인 여자");
	
		
if(ssn == 1) {
	System.out.println("1 = 남자");
	
} else if (ssn == 2) {
	System.out.println("2 = 여자");
}
	}}}
	
	
