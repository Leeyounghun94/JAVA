package ch06.circle;

public class CircleExam {

	public static void main(String[] args) {
		// 주 메뉴가 되는 클래스로 내가 만든 라이브러리 클래스를 new로 인스턴스화
		
		Circle circle = new Circle(); //타입 서클에 스택 서클만들어서 힙을 봄
		
		circle.name = "이영훈";	// -> 원래는 new = String("이영훈"); 인데 생략 함
		circle.radius = 20; 	// -> 객체에 값 입력
		
		
		//동작
		double result = circle.getArea();	// 메서드 호출(동작 -> 리턴)
		
		//출력
		System.out.println("원이 넓이 : " + circle.radius );
		System.out.println("작성자 : " + circle.name);
		System.out.println("동작 결과 : " + result);
		
		
		
		
	}

}