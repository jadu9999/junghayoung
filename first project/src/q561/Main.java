package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		int min = 1000000;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<num.length;i++) {
			num[i] = sc.nextInt(); 		
		}
		
		for(int i = 0; i<num.length;i++) {
			if(num[i] < 100) {
				    //88   0
				if(num[i] > max) {
					max = num[i];
				}
			}
			else if(num[i] >= 100) {
				if(num[i] < min) {
					min = num[i];
				}
			}
		}
		if(max == 0) {
			max = 100;
		}
		if(min == 1000000) {
			min = 100;
		}
		sc.close();
		System.out.print(max+" ");
		
		System.out.print(min);

	}

}
