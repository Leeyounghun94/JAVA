package ch06.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// 싱글톤 사용해봅시다.
		
		// 생성자에 private을 붙여서 불가능함.
		//Sigleton obj1 = new Singleton();
		//Sigleton obj2 = new Singleton();
		
		
		Singleton obj3 = Singleton.getInstance();	// 싱글톤 객체 연결
		Singleton obj4 = Singleton.getInstance();	// 싱글톤 객체 연결
		
		
		if(obj3 == obj4) {
			System.out.println("같은 싱글톤 객체 입니다.");
		}else {
		}	System.out.println("다른 싱글톤 객체 입니다.");
		
		
	}

}
