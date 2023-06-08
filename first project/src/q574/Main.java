package q574;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Max max = new Max();
		max.a = sc.nextInt();
		max.b = sc.nextInt();
		max.c = sc.nextInt();
		
		
		System.out.println( max.max(max.a,max.b,max.c));

	}

}


