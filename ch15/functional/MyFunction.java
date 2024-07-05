package ch15.functional;

@FunctionalInterface	// 함수 람다식인지 검증하는 코드!

public interface MyFunction {
	//인터페이스는 원래 자신을 객체로 사용할 수가 없다.
	//기본적인 상수와 메서드만으로 동작.
	//메서드는 추상메서드가 기본(구현클래스에게 강제로 주입)
	//추상메서드는 실행문 {} 없으며, ; 으로 끝낸다.
	
	//지금 테스트 할 람다식은 추상메서드가 1개만 있어야 한다.
	//MyFunction myfunction = () -> {실행문};
	
	
	
	//추상메서드
	public abstract int method(int x, int y); //Abstract 생략이 가능하지만, 초보자는 적어주자.
	//public abstract void othermethod();
	
	
	
	
	
	
	
	
	
	
}
