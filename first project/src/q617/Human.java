package q617;

import java.util.List;

public class Human {
	private String name;
	private int height;
	
	public static void hmax(List<Human> member) {
		Human min = new Human();
		min.height = Integer.MAX_VALUE; // 최소값으로 초기화
		
		for(int i = 0; i<member.size(); i++) {
			if(member.get(i).getHeight() < min.height) {
			min = member.get(i);
		}		
	}
		System.out.printf("%s %d",min.name,min.height);

}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	


	
	
}
