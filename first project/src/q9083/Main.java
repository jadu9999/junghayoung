package q9083;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		
		printNum(a);
	}
	
	public static void printNum(int num) {
		System.out.println("10큰수 : " + (num+10));
		System.out.println("10작은수 : " + (num-10));
	}
}
