package q112;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a%b;
		int d = a/b;
		
		System.out.println(a + " / " + b + " = " + d + "..." + c );

	}

}
