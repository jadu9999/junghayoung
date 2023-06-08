package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = 1;
		
		for(int i = 0; i<a; i++ ) {
			
			
			for(int j = 0; j<b; j++) {
				
				System.out.printf("%d ",x++ );
				
			}
			System.out.printf("%n");
		}
		
	}

}
