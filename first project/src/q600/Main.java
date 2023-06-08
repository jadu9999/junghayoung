package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int check = 1;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				check++;
				
			}
			
		}
		System.out.println(check);
	}
}
