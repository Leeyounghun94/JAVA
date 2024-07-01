package ch04;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// if문은 조건에 맞는 참, 거짓을 판닪여 실행 흐름을 변경한다.
		// if(조건식) { 실행코드; } -> 실행코드로 쌓여 있는 중괄호를 블럭 이라고 한다.
		
		Scanner input = new Scanner(System.in); // 키보드로 입력 받는 객체 생성
		System.out.print("귀하의 평균을 입력하세요 : ");
		
		double avg = input.nextDouble() ; // 키보드로 실수를 입력받아 avg변수에 넣음
		char grade = 'F'; //학점에 대한 초기값과 변수 선언
		
		
		
		if(avg >= 90) { // avg가 90점 이상 이면 A등급으로 출력
			 grade = 'A'; // A학점 삽입	
				 
		} else if(avg <90 && avg >= 80) // 90점 이하 80점 이상 = B
			 grade = 'B';
		
		else if(avg <80 && avg >= 70)	// 80점 이하 70점 이상 = C
			 grade = 'C';
			
		 else if(avg <70 && avg >= 60)	// 70점 이하 60점 이상 = D
			 grade = 'D';
		
		 else if(avg <60 && avg >= 50)	// 60점 이하 50점 이상 = E
			 grade = 'E';
		
		 else if(avg <50 && avg >= 40)	// 50점 이하 40점 이상 = F
			 grade = 'F';
		
		System.out.println("입력된 점수는 : " + avg);	//TRUE 처리
		System.out.println("현재 등급 : " + grade);
	} 

		}
