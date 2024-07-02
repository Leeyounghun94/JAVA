package ch09.interfaceExam;

public interface RemoteControl {

	//상수(변하지 않는 값) -> 초기값이 있다.
	//타입 상수명 = 값;
	
	/* static final <- 생략해도 상수처리가 된다.*/
	public /* static final */ int MAX_VOLME = 10;	//최대 볼륨
	public int MIN_VOLME = 0; //최소 볼륨
	
	//상수 필드 : 인터페이스는 객체 사용설명서 이다.
	//런타임 시 데이터를 저장할 수 있는 필드를 선언할 수 없다.
	
	
	
	
	
	
	//메서드(추상메서드, 디폴트 메서드, 정적 메서드)
	// 추상메서드 : abstract -> 자식에게 강제로 주입. {실행문} 이 없으며 ; 로 끝내야함.
	
	/* abstract  <- 생략이 가능하다 ! */ 
	public /* abstract */ void turnOn();	//전원을 킨다.
	
	public void turnOff();					//전원을 끈다.
	
	public void setVolume(int volume);		//소리 조절

	
	// 디폴트메서드 : 인스턴스 메서드용 new 로 객체 생성 가능
	/* public <- 쓰는게 맞으나 생략이 가능하다.  */ default void setMute(boolean mute) {// mute = true, false
		if(mute) {
			System.out.println("무음 처리 합니다. ");
		}else {
			System.out.println("무음 처리 해제 ~ ");
		}
	}

	// 정적 메서드 : new 없이 사용되는 메서드
	/* public <- 쓰는게 맞으나 생략이 가능하다. */ static void changeBattery() {
		System.out.println("건전지를 교환해야 합니다.");
		
	}
}
