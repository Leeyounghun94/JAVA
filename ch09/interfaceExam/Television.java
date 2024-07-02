package ch09.interfaceExam;

public class Television implements RemoteControl {
	// 리모컨 인터페이스를 사용하는 구현체
	
	//필드
	
	private int volume;	//숫자로 된 볼륨 값
	
	//기본생성자 : Television tel = new Television
	

	//메서드
	
	@Override	//재정의 (위에서 만든 메서드를 동작시킨다.)
	public void turnOn() {
		// 전원을 켠다
		System.out.println(" TV 전원을 켭니다. ");
	}

	@Override
	public void turnOff() {
		// 전원을 끈다.
		System.out.println(" TV 전원을 끕니다. ");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨 조절용
		if(volume > RemoteControl.MAX_VOLME) { // 볼륨이 리모트컨트롤.맥스볼륨 보다 크면 
			this.volume = RemoteControl.MAX_VOLME;	// 볼륨이 맥스볼륨으로 하고
			
		}else if(volume < RemoteControl.MIN_VOLME) {// 아니면 볼륨이 리모트컨트롤.미니멈볼륨 보다 작으면~
			this.volume = RemoteControl.MIN_VOLME;	// 볼륨이 미니멈볼륨으로 한다.
			
		}else {
			this.volume = volume;
		}//if 종료
		
		System.out.println(" 현재 TV의 볼륨 : " + volume);
	}

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("TV를 무음 처리 합니다. ");
		}else {
			System.out.println("TV를 무음 처리 해제 ~ ");
		}
	}
	

}
