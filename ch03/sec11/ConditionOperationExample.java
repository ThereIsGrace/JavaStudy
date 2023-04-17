package ch03.sec11;

import java.util.Scanner;

public class ConditionOperationExample {

	public static void main(String[] args) {
		int score = 85;
		
		char grade = 'C';
//		char grade = (score > 90) ? 'A' : ((score > 80)? 'B':'C');
		if (score > 90) {
			grade = 'A';
		} 
		if (score > 80) {
			grade = 'B';
		}
		System.out.println(score+"점은 " + grade + "등급입니다.");
	}
}
