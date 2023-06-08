package q556;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ref = new int [10];
		for(int i = 0;i<ref.length;i++) {
			ref[i] = i + 1;
			System.out.print(ref[i]);
			if(i < ref.length - 1) {
				System.out.print(" ");
			}
		}
	}

}

