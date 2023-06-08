package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double [] b = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		
		sc.close();
		
		System.out.printf("%.1f",b[c1-1] + b[c2-1]);
		
		

	}

}
