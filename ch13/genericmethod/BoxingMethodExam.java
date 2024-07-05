package ch13.genericmethod;

public class BoxingMethodExam {

	public static void main(String[] args) {
		// 제네릭 메서드를 사용하여 강한 타입 체크
		
		
//		<> 쓰면서 강제타입변환 안할려고 쓰는것!
		Box<Integer> boxI = Util.<Integer>boxing(100);	//Util.boxing(100);
		int intValue = boxI.get();
		System.out.println(intValue);
		
		
		Box<String> boxS = Util.<String>boxing("홍길동");	// Util.boxing("홍길동");
		String strValue = boxS.get();
		System.out.println(strValue);

		
	}

}
