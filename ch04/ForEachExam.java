package ch04;

public class ForEachExam {

	public static void main(String[] args) {
		// ForEach문은 인덱스를 사용하지 않는다.
		// 정의된 변수에 값이 들어간다.
		// 배열에서는 처음 값 부터 마지막 값까지 변수를 통해서 가져옴
		
		int[] scores = new int[] { 95, 71, 84, 93, 87 };
		
		for (int i : scores) { // 위에 있는 배열의 값이 순서대로 값이 i로 들어가서 출력함.
			// 배열 처음부터 마지막까지 반복해서 값을 i에 넣는다.
			
			System.out.println("값 : " + i);
			
		}
		
		
		String[] name = new String[] { "MBC", "아카데미", "컴퓨터", "교육센터" };
		
		for (String i : name) {
			
			System.out.print(i + " ");
			
			
		}
	}

}
