package q9131;

import java.util.Scanner;

public class Friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Friend f = new Friend();
		Friend s = new Friend();
		System.out.print("친한 친구의 이름을 입력하세요");
		
		
		f.setName("손예준");
		f.setAge(12);
		
		
		
		s.setName(sc.next());
		s.setAge(sc.nextInt());
		
		System.out.print("당신의 이름 : " + f.getName() + "나이 : " + f.getAge());
			
		System.out.println();
	
		
		System.out.print("친구의 이름 : " +  s.getName() + "나이 : " + s.getAge());
	
		
		

	}

}
