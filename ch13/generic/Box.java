package ch13.generic;

public class Box <T> {// <T> 제네릭 코드로 타입을 정하고 시작한다.
	// 위에 명시된 T 가 String 이면 어떻게 될까 ??? -> 그러면 여기에 있는게 전부 String으로 변환.
	

	//필드
	private T t;
	
	
	
	//기본 생성자
	
	
	//메서드


	public T getT() {//게터
		return t;
	}

	public void setT(T t) {//세터
		this.t = t;
	}
	

}
