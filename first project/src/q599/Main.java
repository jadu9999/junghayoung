package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    
		String str = sc.next();
	    String str1 = "";
		String upper = "";
	    
		for(int i =0 ; i < str.length(); i++) {
	    	if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
	    		str1+=str.charAt(i)+"";
	    	}
		}	    
	    
	    upper = str1.toUpperCase();
	    System.out.println(upper);
	        
}
}