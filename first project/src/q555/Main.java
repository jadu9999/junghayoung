package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		String s = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(a);
		System.out.printf("%.1f%n",b);
		System.out.println(s);
		System.out.printf("%c",c);
	}

}
