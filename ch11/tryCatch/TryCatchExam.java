package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchExam {

	public static void main(String[] args) {
		// 예외처리문의 기본은 Try - Catch - Finally
		// Try -> 예외 발생하는 코드
		// Catch -> 예외처리 코드
		// Finally -> 항상 실행되는 코드
		// 예외처리는 대부분 이클립스가 빨간 밑줄로 알려주지만, 실행 후 발생하는 런타임 예외는 경험으로 처리 해야 한다.
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class clazz = Class.forName(scanner.next());
			System.out.println(" 클래스가 존재 합니다. ");
			//예외가 발생할 수 있는 확률이 있는 코드
			
		} catch (ClassNotFoundException e) {
			System.out.println(" 클래스가 존재 하지 않습니다. ");
			e.printStackTrace();	// 예외 로그 출력(실행 할때 빨간글자 띄우는 놈) 또한, 외부에 유출할 때는 주석 처리 해서 안보이게 해야함.
			
		} finally {// 항상 실행되는 코드~
			System.out.println(" 프로그램이 종료 됩니다. ");
		}

	}

}
