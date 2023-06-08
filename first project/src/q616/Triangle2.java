package q616;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	Triangle t = new Triangle();
	
	t.x1=sc.nextDouble();
	t.y1=sc.nextDouble();
	t.x2=sc.nextDouble();
	t.y2=sc.nextDouble();
	t.x3=sc.nextDouble();
	t.y3=sc.nextDouble();
	
	System.out.printf("(%.1f, ",(t.x1+t.x2+t.x3)/3);
	System.out.printf("%.1f)",(t.y1+t.y2+t.y3)/3);
	
	
	}

}

