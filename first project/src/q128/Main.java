package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int check = 0;

		while (true) {
			a = sc.nextInt();
			if (a == 0) {

				break;
			}

			else if (a % 3 == 0 || a % 5 == 0) {
				continue;

			} else {
				
				check++;
				
			}
			
		}
		System.out.println(check);

	}
}
