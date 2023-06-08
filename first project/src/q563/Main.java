package q563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int tmp ;
		
		for(int i = 0; i<a.length;i++) {
			a[i] = sc.nextInt();
		
		}
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					
					
					tmp = a[i]; 
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
