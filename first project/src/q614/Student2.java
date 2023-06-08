package q614;

import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("Jejuelementary","6");
		

		
		
		
		String name = sc.next();
		String grade = sc.next();
		Student s2 = new Student(name,grade);
		
		sc.close();
		
		System.out.println(s1.grade + " grade in " + s1.school + " School ");
		System.out.println(s2.grade + " grade in " + s2.school + " School ");
		
	}

}


