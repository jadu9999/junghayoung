package q525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		if(a==b && a==c) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
}
