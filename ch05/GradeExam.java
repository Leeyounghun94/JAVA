package ch05;

import java.util.Scanner;

public class GradeExam {
	// 학생 이름 테이블 - > string[]
	// 점수 테이블 -> byte[]
	// 총점 테이블 -> int[]
	// 평균 테이블 -> double[]

	public static void main(String[] args) {
		// 주메뉴 구현용

		Scanner mainSC = new Scanner(System.in);
		System.out.println("초기작업 : 학생 수를 입력하세요");
		int count = mainSC.nextInt(); // 학생 수 등록완료~
		String[] name = new String[count]; //
		byte[] engScores = new byte[count];
		byte[] korScores = new byte[count];
		int[] totalScores = new int[count];
		double[] avgScores = new double[count];

		boolean run = true;
		while (run) { // 와일문으로 돌리기 위해 불리언 런 = 트루 처리를 한다.

			System.out.println("=========== Mbc 교육센터 성적 관리 프로그램 ===========");
			System.out.println(" 1.학생관리 | 2.성적관리 | 3.통계관리 | 4.종료 ");
			System.out.println("================================================");
			System.out.print("> > >");
			int select = mainSC.nextInt(); // 1~4까지 정수 입력 후에 분기

			switch (select) {
			case 1:
				System.out.println("학생관리 메서드로 진입합니다.");
				student(name);
				break;

			case 2:
				System.out.println("성적관리 메서드로 진입합니다.");
				scores(engScores, korScores);
				break;

			case 3:
				System.out.println("통계관리 메서드로 진입합니다.");
				scoreAdimin(count, name, engScores, korScores, totalScores, avgScores);
				break;

			case 4:
				System.out.println("종료 합니다.");
				run = false;

				break;

			}// 주메뉴 스위치문 종료
		} // 와일문 종료
	}
		

	// 메인 메서드 종료

		private static void scoreAdimin(int count, String[] name, byte[] engScores, byte[] korScores, int[] totalScores,
		double[] avgScores) {
	// TODO Auto-generated method stub

		Scanner studentSC = new Scanner(System.in);

		System.out.println("=============통계 관리 메뉴===========");
		System.out.println("1.학생 총점, 평균보기 | 2.전체 평균 보기 | 3. 등수 보기 | 4.나가기");
		System.out.println("===================================");
		System.out.print(">>>");
		int select = studentSC.nextInt(); // 통계 관리 메뉴에서 선택 할수 있는 값

		switch (select) {

		case 1:
			for (int i = 0; i < name.length; i++) {
				totalScores[i] = engScores[i] + korScores[i];
				System.out.println(name[i] + "총점 점수 : " + totalScores[i] + "평균은 " + avgScores);
			}
			break;

		case 2:
			for (int i = 0; i < avgScores.length; i++) {
				avgScores[i] = studentSC.nextByte();
				System.out.println("평균 점수 : " + avgScores);
			}
			break;

		default:
			System.out.println("1 ~ 2까지의 번호를 다시 한번 입력해 주세요");
		} // 통계관리 - 스위치문 종료

	}

	private static void scores(byte[] engScores, byte[] korScores) {
		// 여기서 하는 일은 성적 관리용 CRUD

		Scanner studentSC = new Scanner(System.in);

		// engScores[i] = (byte) studentSC.nextInt();
		// korScores[i] = (byte) studentSC.nextInt();

		System.out.println("=====================성적 관리 메뉴===================");
		System.out.println("1.점수 입력 | 2.점수 변경하기 | 3.점수 삭제하기 | 4.문의하기");
		System.out.println("===================================================");
		System.out.print(">>>");
		int select = studentSC.nextInt(); // 위에 메뉴 선택 할 수 있는 값 선택하는 것

		switch (select) {

		case 1:
			System.out.println("입력하고 싶은 과목 번호를 선택해주세요.");
			System.out.println("1. 영어 | 2. 국어 ");
			System.out.print(">>>");
			int a = studentSC.nextInt();

			switch (a) {

			case 1:
				System.out.println("영어 점수 입력");
				for (int i = 0; i < engScores.length; i++) {
					engScores[i] = studentSC.nextByte();
					System.out.println("영어 점수 등록 완료");
				}

				break;

			case 2:
				System.out.println("국어 점수입력");
				for (int i = 0; i < korScores.length; i++) {
					korScores[i] = studentSC.nextByte();
					System.out.println("국어 점수 등록 완료");
				}

				break;
			default:
				System.out.println("1.영어 , 2. 국어 둘 중 하나만 선택해 주세요");
			}//case 1의 스위치 종료

		case 2:
			System.out.println("변경하고 싶은 과목 번호를 선택해주세요.");
			System.out.println("1. 영어 | 2. 국어 ");
			System.out.print(">>>");
			int nameNum = studentSC.nextInt();

		case 3:
			System.out.println("삭제할 과목 번호를 선택해주세요.");
			System.out.println("1. 영어 | 2. 국어 ");
			System.out.print(">>>");
			int deleteNum = studentSC.nextInt();

			switch (1) { //case 3의 switch

			case 1:
				engScores[deleteNum - 1] = 0;
				System.out.println("영어 점수가 삭제 되었습니다.");
				break;

			case 2:
				korScores[deleteNum - 1] = 0;
				System.out.println("국어 점수가 삭제 되었습니다.");
				break;
				
			default :
				System.out.println("삭제 하지 말까요 ?");
				
			}	// case 3의 switch 종료
		case 4 :
			System.out.println("궁금한 점, 이해 되지 않는 점, 의문이 되는 점 등 생길 경우 012-3456-7891 연락바랍니다.");
			break;
				
		default:
			System.out.println("1 ~ 4번 까지 번호를 선택해 주세요");
		} // 성적관리메뉴 - 스위치문 종료

	}// 성적 관리 메서드 종료

	
	
	
	private static String[] student(String[] name) {
		// 여기서하는 일은 학생관리용 CRUD

		Scanner studentSC = new Scanner(System.in);
		boolean run = true; // while반복문 용

		while (run) {

			System.out.println("=============학생 관리 메뉴===========");
			System.out.println("1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 나가기");
			System.out.println("===================================");
			System.out.print(">>>");
			int select = studentSC.nextInt();

			switch (select) {

			case 1:
				System.out.println("학생 등록을 시작합니다.");
				System.out.println("총 학생 수는 : " + name.length);
				for (int i = 0; i < name.length; i++) {// 학생이름 반복문
					System.out.println((i + 1) + "번 학생 이름을 등록하세요"); // 0번 부터 시작하니까 +1 해줘야한다.
					name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열 i에 넣는다.
				}
				System.out.println("학생 등록 완료");
				break;

			case 2:
				System.out.println("학생 리스트를 출력합니다.");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + "번 : " + name[i]);
				}
				break;

			case 3:
				System.out.println("학생 이름 수정합니다.");
				System.out.println("수정할 학생 번호를 입력하세요 : ");
				int nameNum = studentSC.nextInt();
				System.out.println("수정할 학생 이름을 입력하세요 : ");
				String nameMOD = studentSC.next();

				name[nameNum - 1] = nameMOD; // 3번이 왔을때 2번이 수정되야해서 -1
				System.out.println("수정완료");
				break;

			case 4:
				System.out.println("삭제할 학생 번호를 입력하세요");
				int deleteNum = studentSC.nextInt();
				name[deleteNum - 1] = null; // 객체 지울때는 null처리 해야된다.
				break;
				
			case 5:
				System.out.println("이전 단계로 돌아갑니다.");
				run = false;
				break;
				

			default:
				System.out.println("입력값 오류 : 1~4번만 입력하세요 ");
			} // 스위치문 종료

		} // 와일문 종료
		return name;

	} // student() 종료

}// 클래스 종료
