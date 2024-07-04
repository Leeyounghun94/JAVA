package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExam {

	public static void main(String[] args) {
		// SET 인터페이스에는 HashSet, LinkedHashSet, TreeSet 등이 있다.
		// Set은 중복되지 않는 인덱스가 없는 객체를 담아 놓은 구슬 주머니 이다.
		
		Set<String> setHashSet = new HashSet<String>();
		Set<String> LinkedHashSet = new LinkedHashSet<String>();
		Set<String> TreeSet = new TreeSet<String>();
		// 이렇게 3가지가 있다.
		
		
		setHashSet.add("Java");
		setHashSet.add("Oracle");
		setHashSet.add("JDBC");
		setHashSet.add("HTML");
		setHashSet.add("CSS");
		setHashSet.add("JavaScript");
		setHashSet.add("JDBC");
		
		int size = setHashSet.size(); // 객체 수를 반환
		System.out.println("set 객체 수 : " + size);
		int i=0;
		System.out.println("=========== 인덱스가 없어서 for문으로 전체 출력이 안됨 ! ===========");
		
		Iterator<String> iterator = setHashSet.iterator();	//반복자 타입에 SET 타입 연결. //이것은 공식 처럼 외워야 한다.
		
		while(iterator.hasNext()) {//hasNext -> 다음 객체가 있으면 true, 없으면 false
			String element =iterator.next();// 가져온 값(next())을 element에다가 넣는다.
			
			
			System.out.println( ++i + "객체 : " + element);
			
		}
		
		
		setHashSet.remove("CSS");
		
		System.out.println("================== 인덱스가 없어서 For Each문으로 출력 ===============");
		
		for(String entity : setHashSet) {
			System.out.println( ++i + "객체 : " + entity);
		}
		

	}

}
