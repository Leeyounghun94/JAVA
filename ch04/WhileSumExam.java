package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1 ~ 100까지 합을 구하시오 ~ !
		
		
		int i = 1;		// 반복용 상자
		int sum = 0;	//합을 구하는 상자
		
		while (i <= 100) {	// 1 ~ 100까지 반복한다.
			
			sum = sum + i;	// sum = sum + 1 -> i값이 1~100이 나오니까 sum이랑 더한다.
			
			i++;	// i = i + 1 -> 1 ~ 100 까지 증가
	
	} //while문 종료
		
		System.out.println("1 ~ 100까지의 합 :" + sum);

	} // 메서드 종료
	
}// 클래스 종료
