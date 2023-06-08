package q1046;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] score = new int [n];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		List<Integer>list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < n ; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int j =0 ; j < n; j++) {
			if((max != Integer.MIN_VALUE && min != Integer.MAX_VALUE )) {			
				if(score[j] != max && score[j] != min) {
					list.add(score[j]);
				}				
				if(!(list.contains((max+min)/2))) {
					list.add((max+min)/2);		
				}
					
			}
			System.out.println(list);
			for(int i = 0 ; i < score.length; i++) {
				if(score[i] > max) max = score[i];
				if(score[i] < min) min = score[i];
			}
		}
		
		
		
		  max = Integer.MIN_VALUE; 
		  for(int i = 0; i < list.size(); i++) {
		  if(list.get(i) > max) {
			  max = list.get(i); 
			  } 
		  } 
		  System.out.println(max * 1.0);		 
		}

}
