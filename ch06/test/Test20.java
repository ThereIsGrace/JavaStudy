package ch06.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test20 {
	
	public static List<Account> accountList = new ArrayList<Account>();
	
	public static void main(String[] args) {

		int menu;
		do {
			Scanner stdIn = new Scanner(System.in);
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");
			menu = stdIn.nextInt();
			
			switch(menu) {
			case 1: makeAccount(); break;
			case 2: executeAccountList(); break;
			case 3: makeDeposit(); break;
			case 4: withDrawal(); break;
			case 5: exit();
			}
			
		} while(menu!=5);

	}
	// 1. 계좌 만들기
	public static void makeAccount() {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		
		System.out.print("계좌번호:");
		String accountNum = stdIn.nextLine();
		System.out.print("계좌주:");
		String userName = stdIn.nextLine();
		System.out.print("초기입금액:");
		int deposit = stdIn.nextInt();
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		Account account = new Account(accountNum, userName, deposit);
		accountList.add(account);
	}
	
	// 2.계좌 목록 실행하기
	public static void executeAccountList() {
		
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for(int i = 0; i < accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
	}
	
	// 3. 예금 받기
	public static void makeDeposit() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.print("계좌번호:");
		String accountNum = stdIn.nextLine();
		
		int i;
		for(i = 0; i < accountList.size(); i++) {
			if(accountNum.equals(accountList.get(i).getAccountNum())) {
				break;
			}
		}
		
		Account account = accountList.get(i);
		System.out.print("예금액:");
		int money = stdIn.nextInt();
		int originMoney = account.getDeposit();
		account.setDeposit(money + originMoney);
		accountList.remove(i);
		accountList.add(account);
	}
	
	//4. 출금
	public static void withDrawal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호:");
		String accountNum = scanner.nextLine();
		System.out.print("출금액:");
		int withdraw = scanner.nextInt();
		
		int i;
		for(i = 0; i < accountList.size(); i++) {
			if(accountNum.equals(accountList.get(i).getAccountNum())) {
				break;
			}
		}
		Account account = accountList.get(i);
		
		if(withdraw > account.getDeposit()) {
			System.out.println("계좌에 잔액이 부족합니다.");
			System.out.println("출금 가능 잔액:"+account.getDeposit());
			System.out.println("초기 화면으로 돌아갑니다.");
		}else {
			System.out.println("결과: 출금이 성공되었습니다.");
			account.setDeposit(account.getDeposit()-withdraw);
			accountList.remove(i);
			accountList.add(account);
		}
	}
	
	//5. 프로그램 종료
	public static void exit() {
		System.out.println("프로그램 종료");
	}
}
