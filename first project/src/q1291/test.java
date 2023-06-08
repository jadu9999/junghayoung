package q1291;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int e = 0;
		
		while(true) {			
			 s = sc.nextInt(); //4
			 e = sc.nextInt(); //5
			
			if(s < 2 || e > 9 && s < 2 || e > 9) {
				System.out.println("범위를 확인햊쉐요");
				continue;
			}
			else {
				break;
			}
		}

		if(s < e) {
			for(int j = 1 ; j <= 9; j++) {
				for(int i = s; s <= e; i++) {
					System.out.printf("%d * %d = %d" + "    ", i, j ,(i*j));
				}
				System.out.println();
			}
		}
		
	}
}
