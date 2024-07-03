package ch11.throwexam;

public class ThrowsExam {

	public static void main(String[] args) {
		// Throw 예외 발생 시 예외 처리 하는 곳으로 떠넘기는 코드

		
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println(" 클래스가 존재하지 않습니다. ");
			//e.printStackTrace();
		}
				
	}

	public static void findClass() throws ClassNotFoundException {// 클래스를 찾아 주는 메서드
		Class clazz = Class.forName("java.lang.String2");
		System.out.println(clazz + "가 존재합니다.");
		
	}
}
