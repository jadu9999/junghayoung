package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}

		sc.close();
		System.out.println(min);

	}

}
