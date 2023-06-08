package q9114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			char a = sc.next().charAt(0);
		if(97<=a && a<=122) {
			System.out.println("소문자입니다.");
		}else if(65<=a && a<=90) {
			System.out.println("대문자입니다.");
		}else if(48<=a && a<=57) {
			System.out.println("숫자문자입니다.");
		}else {
			System.out.println("영문, 숫자 이외의 문자입니다.");
			break;
		}
	

	}
	}

}
