package q575;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		ZZ zz = new ZZ();
		zz.a = sc.nextInt();
		zz.b = sc.nextInt();
		
		zz.z();
	}

}
class ZZ {
	int a;
	int b;
	
	public void z() {
		int c = a;
		int f = 1;
		
		if(b == 0) {
			System.out.println(f);
		
		}else {
		for(int i = 1; i < b; i++) {
			a = a * c;
		}		
		System.out.println(a);
	}
}
}

