package ch06.calender;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		// Calender 객체를 이용해서 날짜를 처리함
		
		Calendar cal = Calendar.getInstance();// -> 이것도 외우면 좋다.
		// .getInstance()는 내장된 객체를 가져옴 ( new X)
		
		int year = cal.get(Calendar.YEAR);	//< 연,월,일,시,분,초 가 들어갈수있으며 이 문장 외우면 좋다.
		// get() 메서드는 객체의 값을 가져오는 동작
		// Calendar.YEAR 매개값으로 년도를 신청함.
		
		// ctrl + 클릭(YEAR) 하면 YEAR 등록된 설명서가 나온다(비록 영어지만 한번 보라고~) 
		System.out.println("현재 년도 : " + year);

		int month = cal.get(Calendar.MONTH)+1;	
		// calendar의 Month는 0부터 시작하기 때문에 +1 해줘야 해당 월이 나온다.	// 버전 업데이트가 되면 달라질 경우가 있기 때문에 먼저 찍어보고 판단 ㄱㄱ
		System.out.println("현재 월 : " + month);
		
		int day =  cal.get(Calendar.DAY_OF_MONTH); 
		// Calendar.DAY_OF_MONTH -> 해당 월에 해당하는 일자를 가져옴
		System.out.println("현재 일 : " + day);
		
		Week today = null;
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("현재 요일 : " + week);
		//DAY_OF_WEEK 는 요일이 숫자로 나온다. -> 일요일 = 1
		
		switch (week) {// 요일 숫자로 받은 값을 변환해야한다.

		case 1:
			today = Week.SUNDAY;	//일요일
			break;
			
		case 2:
			today = Week.MONDAY;	//월요일
			break;
			
		case 3:
			today = Week.TUESDAY;	//화요일
			break;
			
		case 4:
			today = Week.WEDNESDAY;	//수요일
			break;
			
		case 5:
			today = Week.THURSDAY;	//목요일
			break;
			
		case 6:
			today = Week.FRIDAY;	//금요일
			break;
			
		case 7:
			today = Week.SATURDAY;	//토요일
			break;
			
		default:
			System.out.println("버그 생성 : 작성자에게 문의하세요");
			
		}
		System.out.println("현재 요일 : " + today);
		
		
		
		
		
		
		int hour = cal.get(Calendar.HOUR);
		System.out.println("현재 시간 : " + hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("현재 분 : " + minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println("현재 초 :" + second);
		
		
		// 
		
		
		
		
	}

}
