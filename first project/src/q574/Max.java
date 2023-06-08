package q574;

public class Max {
	 int a;
	 int b;
	 int c;
	
	
	public int max(int a , int b, int c) {
		int max = Integer.MIN_VALUE;
		int [] num = {a,b,c};
		
		for(int i = 0; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}		
		}
		
		return max;

	}		
}
