package ch08.extended.people;

public class MBCSchoolExam {

	public static void main(String[] args) {
		// 상속 관계의 객체를 가져와 출력해보자.
		// 생성자를 활용해본다. -> 객체 생성 시 초기값을 줌.
		
		
		//부모 객체를 사용해보자.(부모도 new 쓸 수 있다.)
		
		
		People people = new People("부모", "엄마주민번호");
		System.out.println(people.name + people.ssn);
		
		
	
		
		Student student = new Student("자식", "자식주민번호", 15);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
	
		
		
		
		
		Teacher teacher = new Teacher("선생님", "선생님 주민번호", 39);
		System.out.println(teacher.name);
		System.out.println(teacher.ssn);
		System.out.println(teacher.employeeNo);
		
		
		
		
		// 다형성
		People multi1 = new Student("이영훈", "영훈씨 주번", 2);
		People multi2 = new Teacher("김기원", "김기원 주번", 22);
	

	}

}
