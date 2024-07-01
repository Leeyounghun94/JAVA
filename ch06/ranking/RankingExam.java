package ch06.ranking;

import java.util.Scanner;

public class RankingExam {

	public static void main(String[] args) {
		// 열거타입을 사용하려면 객체를 생성하여 활용함(new 사용이 안됨)
		
		
		//Ranking rk = new Ranking(); -> 이렇게 사용은 XX
		Ranking rk = Ranking.GUEST;
		String rkString = rk.name();	// enum 타입의 상수값을 문자열로 변환
		System.out.println("euum값 : " + rk);
		
		Ranking rk1 = Ranking.GUEST;
		Ranking rk2 = Ranking.GUEST;
		
		System.out.println(rk == rk2); // -> TRUE 나온다, eum은 객체 1개이고 1개 가지고 여러개 돌려쓴다는 느낌.
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("키보드 입력 : ");
		System.out.print(">>>");
		String rank = input.next();
		
		//Incompatible operand types Ranking and String <- 오류 나기 때문에 입력하면 X
		System.out.println("값 비교 " + (rkString == rank));
		System.out.println("equal비교 : " + (rkString.equals(rank)));
		
		int enumindex = rk.ordinal();
		System.out.println("열거 순서 파악 : " + enumindex );
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
