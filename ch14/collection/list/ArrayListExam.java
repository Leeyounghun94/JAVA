package ch14.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		// List 컬렉션은 ArrayList, Vector, LinkedList 3가지를 주로 사용한다.
		// List 컬렉션은 배열 대신 활용도가 높다. (길이가 자유롭기 때문)
		// List<String> 는 강한타입체크로 String만! 들어간다.
		// List<String> list = new ArrayList<String>(); -> 10개가 기본값.
		
		
		List<String> listS = new ArrayList<String>();
		
		listS.add("Java"); // 0번 인덱스(JAVA)
		listS.add("Oracle");// 1번 인덱스(데이터베이스)
		listS.add("JDBC");	// 2번 인덱스(자바 + 데이터베이스 연동)
		listS.add("HTML, CSS, JS"); // 3번 인덱스(프론트)
		listS.add("jsp"); // 4번 인덱스(자바 + 데이터베이스 + 프론트)
		listS.add("서버프로그램(Tomcat)");	//	 인덱스(서버 프로그래밍(Servlet)
		listS.add("리눅스");	//인덱스(배포 서버)
		listS.add(5,"servlet"); //인덱스(jsp + java)
		listS.add("AWS");	//인덱스(가상 배포서버)
		
		int size = listS.size();
		System.out.println("총 객체 수 : " + size + "개");
		System.out.println("==========================================================");
		
		String skill = listS.get(2);	//2번 인덱스값을 가져와 SKILL 변수에 넣음.
		System.out.println("두번째 인덱스 값 : " + skill);
		
		System.out.println("====================전 체 출 력=============================");
		
		
		listS.remove(2);
		listS.remove(2);
		listS.remove("jsp");
		
		
		
		for(int i=0; i < listS.size() ; i ++) {
			System.out.println(i + "번째 값 : " + listS.get(i));
		}
		
		
		
		
		
		listS.remove(2);
		
		
		
		
		
		System.out.println("================ For Each 전체 출력(인덱스 사용 X) ==================");
		
		
		for(String str : listS) {
			System.out.println(str);
			
		}
		
		
		
		
	}

}
