package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int a = sc.nextInt();
		int check = 0;
		for(int i = c.length-1; i >= 0; i--) {
			check++; 
			if(check > a) {
				
				break;
			}
			System.out.print(c[i]);
		}
		

	}

}
