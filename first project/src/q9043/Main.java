package q9043;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		int counts = 0;
		while(true) {
			int count = sc.nextInt();
			if(count == 0) break;
			
			if(count % 2 == 1) {
				sum = sum+count;
				counts++;
			}			
		}
		
		
		System.out.println("홀수의 합 = " + sum);
		System.out.println("홀수의 평균 =" + sum/counts);
		
	}

}
