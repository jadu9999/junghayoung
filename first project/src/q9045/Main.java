package q9045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int count = sc.nextInt();

		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n" ,count, i , i*count);
		}
	
	}

}
