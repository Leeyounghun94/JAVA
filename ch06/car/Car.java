package ch06.car;

public class Car {
	// 자동차 객체용 클래스
	
	
	//필드(멤버 변수)
	//	고유 데이터
	String company;	//제작회사
	String model;	// 모델명
	String color;	// 색상
	int maxSpeed;	// 최고 속도
	//int minSpeed;	// 최저 속도
	
	//	상태
	int speed;	// 현재 속도
	int rpm;	// 현재 엔진 회전수
	boolean start;	// 시동 유무
	
	//	부품
	Body body;	// 차 종류
	Engine engine;	//현대? 기아? 쉐보레?
	Tire tire;	//넥센? 한국?
	
	
	
	//생성자(new 쓸때) -> Source - 메뉴에서 제네레이트 유징 필드 활용하세요
	public Car() {
	}// 기본 생성자는 자동으로 생성이 안되기 때문에 Car myCar = new Car(); <- 빨간줄 안생김
	
	
	public Car(String company, String model, String color, int maxSpeed, boolean start) {
		super();	//상속에 관련된 메서드 인데 지금은 
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.start = start;
	}


	@Override	//재정의 코드 (객체를 문자열로 출력)
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + ", rpm=" + rpm + ", start=" + start + "]";
		// source - 제네레이트 toString () 눌르면 해당 객체 선택해서 만들기하면 됨
	}
	
	
	
	
	
	
	
	
	
	
	//메서드(동작)
	
	
	
	
	
	
	
	
	
	
	
	
}
