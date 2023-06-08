package q186;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char d = sc.next().charAt(0);
		
		String a[] = new String[c];
		String b[] = new String[d];

		
		int x = 0;
		int y = 0;

		if (a.length < b.length) {

			for (int i = 0; i < b.length; i++) {
				x++;
			}
			System.out.println(x);
			
		}else if(a.length > b.length) {
			for (int i = 0; i<a.length; i++) {
				y++;
				
			}
		}

	}

}
