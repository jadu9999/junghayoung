package q9055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		sc.close();
		for(int i = 1; i<a; i++) {
			sum+=i;
			if(sum>a) {
				System.out.printf("%d %d",i,sum);
				break;
			}
		}

	}

}
