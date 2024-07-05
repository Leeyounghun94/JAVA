package ch15.functional;

public class MyFuctionExam {

	public static void main(String[] args) {
		// 원래는 인터페이스를 사용하기 위해서는 구현 클래스가 있어야 한다.
		// 그런데, 익명의 구현 객체를 이용하기도 한다.
		
		
		
		
		MyFunction myFunction;	//인터페이스를 변수에 타입으로 설정
		
		

		
		myFunction = (x, y) -> {
			int result = x * y;	//실행문1
			return result;	//실행문2
		}; //익명의 구현 객체 -> 동작에 실행코드를 주입
		
		
		int result = myFunction.method(10, 20);// 실행문이 2개인 메서드 실행 
		System.out.println(result);
		
		
		System.out.println("------------------------------------------");
		System.out.println(myFunction.method(10, 20));
		
		System.out.println("===========================================");
		
		
		myFunction = (x, y) -> x * y;	// 이렇게 람다식은 코드가 짧아지며 간결화 하게 만들어진다.
		System.out.println(myFunction.method(20, 30));	//실행문 1개로 압축 시 { } 생략 가능
		
		
		
		myFunction = (x, y) -> sum(x, y);
		System.out.println(myFunction.method(20, 30));
		
		
	
	}//메인 종료

	
	public static int sum(int x, int y) {
		return (x * y);
	
	
	
	
	
	}
	
	
	
	
	
	
}
