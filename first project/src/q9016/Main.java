package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("키를 입력하세요. ");
		System.out.print("몸무게를 입력하세요. ");
		System.out.print("이름을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		double b = sc.nextDouble();
		String s = sc.next();
		sc.close();
		System.out.print(" 키 = ");
		System.out.println(a);
		System.out.print("몸무게 = ");
		System.out.printf("%.1f%n",b);
		System.out.print("이름 = ");
		System.out.println(s);
		

	}

}
