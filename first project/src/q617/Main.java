package q617;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Human> hb = new ArrayList<Human>();
		
		for(int i = 0; i< 5; i++) {
			Human h = new Human();
			
			h.setName(sc.next());
			h.setHeight(sc.nextInt());
			
			hb.add(h);	
		}
		
		Human.hmax(hb);
		

	}

}


