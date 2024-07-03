package ch12.threadname;

public class ThreadA extends Thread{// 방법2
	
	public ThreadA() {
		setName("스레드 A");
		
		
	}//생성자

	@Override
	public void run() {
		
		for(int i = 0; i<2 ; i++ ) {
			System.out.println(getName() + "가 출력한 내용");
		}
		
	}
	
	
	

}
