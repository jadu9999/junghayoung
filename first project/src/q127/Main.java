package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		int check = 0;
		
		
		while(true) {
			a = sc.nextInt();
			if(a >100 || a<0)
				break;
			check++;
			sum +=a;
		}
			System.out.println("sum " + sum);
			System.out.printf("avg : %.1f ", (double)sum/check);
			
		}
				
		

	}


