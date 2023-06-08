package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i  > -1; i++) {
			char a = sc.next().charAt(0);
			
			if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
				System.out.println(a);
			}
			else if((a >= 48 && a <= 57)){
				System.out.printf("%d \n" , (int)a);
			}
			else if((a>=32 && a<=47) || (a>=58 && a<=64) || (a>=91 && a<=96) || (a>=123 && a<=126)){
				break;
			}
		}
		sc.close();
	}

}
