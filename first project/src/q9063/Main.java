package q9063;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] ref = new int[5];
		for(int i = 0; i < ref.length; i++) {
			ref[i] = sc.nextInt();
			System.out.print(ref[i] + " ");			
		}
		
		sc.close();
	}

}
