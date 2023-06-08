package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[4];
		int sum = 0;
		int check = 0;

		 
		
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
			check++;
			
		}
		int avg = sum/check;
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
	}

}
