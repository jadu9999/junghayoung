package q555;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] ref = new String [10];
		for (int i = 0;i < ref.length; i++) {
			ref[i] = sc.next();
			System.out.printf("%s",ref[i]);
		}
		sc.close();
	}

}
