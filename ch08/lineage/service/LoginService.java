package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.DTO.Account;

public class LoginService {
	
	// 로그인에 관한 부메뉴용
	
	public static Account menu(Scanner scanner,  Account[] accounts,  Account loginAccount) {
		System.out.println("1. 로그인 |2.회원가입 |3.회원수정 |4.빠져나가기");
		System.out.print(">>>");
		int select = scanner.nextInt();
		
		switch (select) {
		case 1 :
			System.out.println("로그인을 시작합니다.");
			System.out.print("id : ");
			String id = scanner.next();
			System.out.print("pw : ");
			String pw = scanner.next();
			Account account = new Account();
			account.setId(id);
			account.setPw(pw); //새로 만든 account 객체에 id,pw 삽입
			
			
			//배열에 있는 값과 비교
			for(int i=0; i < accounts.length; i++) {
				if(accounts[i] !=null) {
					if(accounts[i].getId().equals(account.getId()))	{//겟아이디랑 겟 아이디랑 비교해서
						System.out.println("해당하는 id가 있습니다.");
						if(accounts[i].getPw().equals(account.getPw())) {//겟 pw랑 겟pw 비교
							System.out.println("해당하는 pw가 있습니다.");
							loginAccount = accounts[i]; 
							System.out.println("로그인 성공 !");
							break;
							
						} else {
							System.out.println("해당하는 pw가 없습니다.");
						}
					}else {
						System.out.println("해당하는 id가 없습니다.");
						
					}
				}else {
					System.out.println("해당하는 정보가 없습니다.");
					break;
				}//빈 객체 비교
			}//for문 종료
			
		case 2 :
			System.out.println("로그인을 시작합니다.");
			
		case 3 :
			System.out.println("로그인을 시작합니다.");	
		
		
		}//스위치문 종료
		return loginAccount;
		
	}//menu 메서드 종료
	
	
	//필드
	
	
	//생성자
	
	
	//메서드

}
