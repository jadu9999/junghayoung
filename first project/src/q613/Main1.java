package q613;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		Main m = new Main();

		m.setName(sc.next());
		m.setGrade(sc.nextInt());
		m.setSchool(sc.next());

		System.out.println("Name : " + m.getName());
		System.out.println("School : " + m.getSchool());
		System.out.println("Grade : " + m.getGrade());

	}

}
