package ch12.threadname;

public class TreadNameExam {

	public static void main(String[] args) {
		// 스레드의 이름을 정하면 버그 수정에 좋다.
		
		Thread mainThread = Thread.currentThread();	
		// 사용중인 스레드 객체 얻기.
		mainThread.getName(); // 스레드 이름 가져옴

		System.out.println("mainThread.getName() : " + mainThread.getName());
		//메인 스레드의 객체를 가져와 이름을 출력하는 메서드 실행
		
		
		ThreadA tha = new ThreadA();	//스레드A를 객체로 만듬
		System.out.println("new ThreadA().getName() : " + tha.getName());
		//스레드 시작
	
		
		
		mainThread.getName(); // 스레드 이름 가져옴

		System.out.println("mainThread.getName() : " + mainThread.getName());
		//메인 스레드의 객체를 가져와 이름을 출력하는 메서드 실행
		
		
		ThreadA thb = new ThreadA();	//스레드B를 객체로 만듬
		System.out.println("new ThreadA().getName() : " + thb.getName());
		//스레드 시작
		
		
		
		
		
		
		
		
		
		
	}

}
