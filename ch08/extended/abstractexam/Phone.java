package ch08.extended.abstractexam;

public abstract class Phone {//조장용(abstract 추상클래스)

	
	
	
	// 필드
	
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//생성자
	
	
	
	//메서드
	public void turnOn() {
		System.out.println("폰의 전원을 켭니다.");
		
	}
	
	public void turnOff() {
		System.out.println("폰의 전원을 끕니다.");
		
	}
}
