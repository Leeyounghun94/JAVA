package ch08.extended.people;

public class Student extends People {
	//필드
	
	
	public int studentNo;
	
	
	
	
	
	
	
	//생성자
	public Student(String name, String ssn, int studentNo) {
		
		//this.name = name;
		//this.ssn = ssn;
		super(name, ssn);	//부모 호출 할 때 쓴다.
		this.studentNo = studentNo;
	}//커스텀 생성자 Student student = new Student("김기원", "주민번호",2406);
	
	
	
	
	
	
	
	//메서드
}
