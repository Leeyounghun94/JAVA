package ch05;

public class ArraySortASCExam {

	public static void main(String[] args) {
		// 버블정렬 오름차순으로 구현 (IQ = 150 이상)
		// 오름차순은 작은 값부터 큰 값으로 재배열함
		// 필수 항목 : temp 임시방
		
		int[] scores = new int[] { 79, 88, 91, 33, 100, 55, 95 };
		// scores 변수에 int 배열 7칸 생성하며 정수가 들어있음
		
		
		System.out.println("======== 배열 초기값 출력 ==========");
		for( int i=0 ; i < scores.length; i++) {
			
			System.out.print(scores[i]+ " " );
		}
		
		System.out.println();
		System.out.println("================================");
		System.out.println("==========오름 차순 정렬 시작=======");
		
		for(int j = 0 ; j < scores.length-1 ; j++ ) {
			for( int k=0 ; k < scores.length-1-j ; k++ ) { 
				if(scores[k] > scores[k+1]) {
				int temp = scores[k] ; // 큰 값이 temp에 저장됨
				scores[k] = scores[k+1]; // 작은 값이 k번 째에 저장
				scores[k+1] = temp ; // temp 큰 값이 k+1 번째 저장
						
				}// 옆 자리랑 비교해서 큰지 물어보는 if문
				
				System.out.println("======== 배열 정렬 중 출력 ==========");
				for( int i=0 ; i < scores.length; i++) {
					
					System.out.print(scores[i]+ " " );
				}
				
				System.out.println();
				System.out.println("================================");
				
			}// 싸이클 1번 (0 ~ 6) 싸이클 2번 ( 0 ~ 5) 싸이클 3번 ( 0 ~ 4 )
				
		System.out.println(" 싸이클 종료");
		
		}// j는 0 부터 6까지 반복 (싸이클 반복용)
		
		System.out.println("======== 배열 정렬 오름 차순 결과값 출력 ==========");
		for( int i=0 ; i < scores.length; i++) {
			
			System.out.print(scores[i]+ " " );
		}
		
		System.out.println();
		System.out.println("================================");
		
		
		
	}

}
