package ch04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기 !
		// C -> 시동을 건다.(START)
		// R -> 계기판 정보 출력
		// U -> 주행
		// D -> 시동을 끈다.(END)
		
		Scanner input = new Scanner(System.in);
		

		Boolean run = true ; // -> 시동을 킨다.
		int speed = 0; //차량속도
		final int MAXSPEED = 300;	// 최고속도 상수(변경X)
		final int MINSPEED = 0;		// 최저속도 상수(변경X)
		
		//MAXSPEED = 400; ->The final local variable MAXSPEED cannot be assigned. It must be blank and not using a compound assignment
		// 수치가 넘어버리기 때문에 오류가 뜬다. /상수는 대문자로 써줘야 한다.
		
		
		System.out.println("페라리가 입고 되었습니다.");
		System.out.println("시동을 켭니다.");
		System.out.println("현재 속도 : " + speed + "km/h");
		
		
		
		while(run) {
			// 무한 반복 중 메뉴가 출력
			System.out.println("==============================");
			System.out.println("0. 시동 종료 ");	//종료 성공
			System.out.println("1. 엑셀 ");		// 30키로 가속+ 300이하 최대 성공!
			System.out.println("2. 브레이크 ");
			System.out.println("3. 멀티미디어 ");
			System.out.println("4. 주유하기 ");
			System.out.println("===============================");
			System.out.print("(0 ~ 4 숫자입력) >>>>>>");
		
			int select = input.nextInt();
			
			switch(select) {
			case 0 :
				System.out.println("시동을 종료 합니다.");
				run = false;	//while문 종료
				
				break;
			
			case 1 :
				System.out.println("가속을 진행 합니다.");
				speed += 30;
				if(speed >= MAXSPEED) { //현재 속도가 최고속도보다 크거나 같으면 !
					speed = MAXSPEED;
					
				}	// 300이상 출력이 안되게 함.
				System.out.println("현재 속도 : " + speed + "km/h");
				
				break;
				
			case 2 :
				System.out.println("감속을 진행 합니다.");
				speed -= 10;
				
				if(speed <= MINSPEED) {
					speed = MINSPEED;
				}
				
				
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
				
			case 3 :
				System.out.println("멀티미디어 작동합니다.");
				break;
				
			case 4 :
				System.out.println("주유.");
				break;
				
	}	//스위치문 종료

}	// 와일문 종료
		System.out.println(" 페라리 자동차가 사라집니다.");
}	// 메서드 종료
}	// 클래스 종료