package q562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int [] num = new int[10];
		int evensum = 0;
		double oddsum = 0;
		int sum = 0;
		double avg = 0;
		int check = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(i % 2 ==0) {
				oddsum +=num[i];//홀수번째
				check++;
				
			}
			else if(i % 2 == 1) {
				evensum +=num[i]; //짝수번째
				
			}
			
		}
		avg = oddsum / check;
		
		System.out.println("sum : " + evensum);
		System.out.printf("avg : %.1f ",avg);
		
		
	}
}
