package ch03;

import java.util.Scanner;

public class LogicalSumExam {

	public static void main(String[] args) {
		// 논리합은 파이프 |, || 로 비교할수 있으며 둘중 하나라도 참이면 TRUE 로 나옴
		// ~ 이거나 일때 사용된다. -> 문자 판단 시 활용
		
		
		Scanner input = new Scanner(System.in); // 키보드로 입력 받은 객체 생성
		System.out.println("숫자를 입력하시면 배수를 판단할 수 있씁니다.");
		int value = input.nextInt(); //키보드로 입력된 정수를 value 변수에 넣음
		
		if((value%2==0) | (value%3==0)              ) {
			//값을 2로 나누었을 때 나머지가 0이면 -> 2의 배수
			//값을 3으로 나누었을때 나머지가 0이면 -> 3의 배수
			//참 일때
			System.out.println(" 입력된 값은 2의 배수 이거나 3의 배수 입니다.");
			
}
		
}}