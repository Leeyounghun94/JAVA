package ch09.interfaceExam;

public class RemoteAnonymusExam {

	// 인터페이스를 구현클래스로 사용하지 않고 인터페이스만으로 실행한다.
	
	public static void main(String[] args) {
	
	RemoteControl remoteControl = new RemoteControl() {
	int volume ;	
	
		@Override
		public void turnOn() {
			System.out.println("익명으로 전원을 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("익명으로 전원을 끕니다.");
		}
		
		@Override
		public void setVolume(int volume) {
			
				// 볼륨 조절용
				if(volume > RemoteControl.MAX_VOLME) {
					this.volume = RemoteControl.MAX_VOLME;
					
				}else if(volume < RemoteControl.MIN_VOLME) {
					this.volume = RemoteControl.MIN_VOLME;
					
				}else {
					this.volume = volume;
				}//if 종료
				
			System.out.println("현재 익명 객체 볼륨 : " + volume);
			
		}
	}; // ; <- 익명 클래스(1회용)
	
	}
}
