package ch02;

public class CastingExam {

	public static void main(String[] args) {
		// Catsting은 강제 타입 변환으로 큰타입을 작은타입으로 강제 주입할 때 사용
		// 단, 손실이 발생 -> 2진법에 영향을 받는다.
		// int 변수명 = (int) double값 ;
		
		
		int intvalue = 12345678;
		byte bytevalue = (byte) intvalue;
		
		System.out.println("int 값 : " + intvalue);
		System.out.println("byte 값 :" + bytevalue);
		
		
		
		
		System.out.println("==========자동 타입 변환============");
		int intvalue1 = 10;
		double doublevalue1 = 5.5;
		double result1 = intvalue1 + doublevalue1 ;
		System.out.println("int 10 + double 5.5 =" + result1);
		
		
		
		System.out.println("==========정수로 결과를 봄=========");
		int result2 = (int) (intvalue1 + doublevalue1);	//강제 타입 변환
		System.out.println("int 10 + double 5.5 = " + result2);
		
		
		
	
		
		

	}

}
