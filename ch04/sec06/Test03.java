package ch04.sec06;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// 로그인 프로그램
		String id = "ezen";
		String pw = "12345";
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("로그인을 해주세요.");
		System.out.print("아이디 입력:");
		String put_id = scanner.nextLine();
		
		if(!put_id.equals(id)) {
			System.out.println("아이디가 일치하지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
		} else {
			while(true) {
				System.out.print("패스워드 입력:");
				String put_pw = scanner.nextLine();
				
				if(put_pw.equals(pw)) {
					System.out.println("OK");
					break;
				}
				else if(count!=2) {
					System.out.println("패스워드가 틀렸습니다. 종료시까지 남은 횟수: " + (2-count));
				} else {
					System.out.println("Get Out!");
					break;
				}
				count++;
			}
		}
	}
}
