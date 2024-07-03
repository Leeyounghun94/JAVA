package ch10;

public class StringBufferExam {	// 구형 버전

	public static void main(String[] args) {
		// String 만든 문자열은 객체로 추가, 변경이 안되며 새로운 객체를 또 만든다.
		// StringBuffer는 문자열을 수정과 변경을 할 수 있다.
		// StringBuilder는 StringBuffer와 다르게 멀티 스레드 환경에서 안정적이지 않음
		// StringBuiler는 싱글 스레드 환경에서 StringBuffer보다 더 빠른 성능을 가짐.

		StringBuffer stringBuffer = new StringBuffer();	// 16개 문자 배열
		StringBuffer stringBuffer1 = new StringBuffer("Hello ");	// 5개 문자열 배열
		StringBuffer stringBuffer2 = new StringBuffer("Hello "); // 50개 문자열 배열
	
		stringBuffer1.append("Programming");	// Hello Programming
		System.out.println(stringBuffer1);
		
		stringBuffer1.insert(6, "JAVA ");	// 위에 6번째 에다가 자바를 넣는다.
		System.out.println(stringBuffer1);

		stringBuffer1.replace(1, 4, "Good");	// 4되기 전에 good으로 넣음
		System.out.println(stringBuffer1);

		stringBuffer1.delete(1, 5);			
		System.out.println(stringBuffer1);

		stringBuffer1.reverse();			//역순으로 출력
		System.out.println(stringBuffer1);

		System.out.println(stringBuffer1.equals(stringBuffer2)); // equlas 재정의 안됨

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
