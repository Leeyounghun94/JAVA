package ch12.priority;

public class PriorityExam {

	public static void main(String[] args) {
		// 스레드를 열 개 만든다. 10번 스레드의 우선순위값을 10으로 준다.
		// 누가 먼저 20억을 반복하고 끝나는지 확인한다.
		
		for(int i=1; i <= 10; i++ ) {
			
			Thread th = new CalcThread("스레드" + i);	// 객체 생성되며 이름이 만들어짐.
			
			if( i != 10) {
				th.setPriority(Thread.MIN_PRIORITY);	// Thread.MIN_PRIORITY(우선 순위 1)
				
			}else {
				th.setPriority(Thread.MAX_PRIORITY);	// Thread.MIN_PRIORITY(우선 순위 10)
			}
			
			th.start();
	
		}//스레드 10개 생성 및 실행
		
	}

}
