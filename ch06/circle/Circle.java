package ch06.circle;

public class Circle {
	//메인()이 없는 클래스는 라이브러리 클래스라고 한다.(인스턴스용_
	// 인스턴스는 객체를 생성하는 용도
	
	// 필드(멤버 변수로 객체가 가지고 있을 값)
	public int radius;
	public String name;
	
	
	
	//생성자(Circle circle = new Circle(); -> 기본 생성자로 생략 가능
	
	public Circle() {// 객체 생성 시 매개값 없이 생성
		
	}// -> 기본 생성자(클래스와 이름이 같은 메서드)
	
	
	public Circle(int radius) {// 생성자 오버로딩
		this.radius = radius;	// -> this 써주면서 앞에 radius 색깔 과 뒤에 radius 색깔을 위에 올려주면서 값 전달
	}//사용자 지정 생성자 -> Circle circle = new Circle(10);
	
	
	
	public Circle(int radius, String name) { // 생성자 오버로딩
		this.radius = radius;
		this.name = name;
		
	}//사용자 지정 생성자 -> Circle circle = new Circle(10, "지구");
 	
	
	
	
	
	//메서드(동작에 해당하는 코드)
	
	
	public double getArea() {
	
		return 3.14 * radius * radius ;
		// getArea() 호출 시 원의 값을 계산하여 출력
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
