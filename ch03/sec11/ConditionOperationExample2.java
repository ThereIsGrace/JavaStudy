package ch03.sec11;

import java.util.Scanner;

public class ConditionOperationExample2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char grade;	
		
		while(true) {
			System.out.print("점수를 입력해주세요: ");
			String score = scanner.nextLine();
			if (score.equals("q") || score.equals("Q")) {
				System.out.println("종료합니다.");
				break;
			} else {
				int score2 = Integer.parseInt(score);
				if(score2 >= 90) {
					grade = 'A';
				}else if(score2 >= 80) {
					grade = 'B';
				}else if(score2 >= 70){
					grade = 'C';
				}else if(score2 >= 60) {
					grade = 'D';
				}else {
					grade = 'F';
				}
				System.out.println("등급은 " + grade + "입니다.");
			}
		}
	}
}