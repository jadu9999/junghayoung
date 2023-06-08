package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10000];
		int b = 0;
		int c = 0;

			
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i] == 0) {
				break;
			}
			
			if (a[i] % 2 == 0) {
				b++;
			} else if (a[i] % 2 != 0) {
				c++;
			}
			
	
			
		}
		sc.close();
		System.out.println("odd : " + c);
		System.out.println("even : " + b);

	}

}