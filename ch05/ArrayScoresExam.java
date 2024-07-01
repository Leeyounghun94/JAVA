package ch05;

import java.util.Scanner;

public class ArrayScoresExam {

	public static void main(String[] args) {
		// 배열을 이용해서 성적표를 만들어 보자.
		// 학생 수를 파악한다.
		// 점수를 입력한다.
		// 총점과 평균을 구하여 출력한다.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("========== 성적표 ===========");
		System.out.println("학생수를 입력하세요 : ");
		System.out.println(">>>");
		
		int count = input.nextInt();
		
		
		int [] scores = new int [count]; // 키보드로 입력 받은 값에 따라 배열 길이 생성.
		
		System.out.println("배열의 길이 : " + scores.length);
		
		
		
		for(int i=0; i<scores.length; i++)	{
			// scores.length(배열길이) -> 이거는 외우자 ! / =은 안쓴다( i<=scores (x))
			System.out.println((i + 1) + "번째 학생의 점수를 입력하세요 ");
			scores[i] = input.nextInt();
		} // 학생 수 만큼 배열에 점수를 입력한다. (C)

		
		System.out.println("==========입력된 점수 확인=========");
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + " "); // 점수 점수 점수 점수 -> 이렇게 표시
		}
		
		
		System.out.println();
		System.out.println("==============================");
		
		
		System.out.println("=========수정할 번호 입력=========");
		int select = input.nextInt();
		
		
		System.out.println();
		System.out.println("=========수정할 점수 입력=========");
		
		int score = input.nextInt();

		scores[select-1] = score ;	// 1입력할때 -1 을 해야 0이 되어야해서 이렇게 함.
		System.out.println("수정한 결과 확인");
		System.out.println(select + " 번의 점수는 : " + score + "으로 수정 완료!!!");
		System.out.println("==============================");
		
		// 총점과 평균을 구함
		
		int sum = total(scores);	//> 밑에서 구한 sum이 여기로 온다
		System.out.println("총점 : " + sum + "입니다. ");
		
		
		double ave = average(sum, count);
		System.out.println("평균 : " + ave + "점 입니다. ");
		
		
		

		
	} // main() 메서드 종료
	
	static double average(int sum, int count ) { // 총점이 들어와서 평균이 됨.
		double ave = 0 ;
		ave = sum / count ; // 평균 구하는 메서드
		
		return ave;
		
	}
	

	static int total(int[] scores) {
		int sum = 0;
		
		for(int i = 0; i < scores.length ; i++) {
			sum += scores[i]; // -> scores의 모든 값을 sum에 누적
		} // scores 배열의 값을 모두 가져옴
		
		return sum; // 표가 들어와서 sum이 되고 sum이 인트로 된다.
	}//scores 배열을 받아 int로 리턴
	
	
	
}
