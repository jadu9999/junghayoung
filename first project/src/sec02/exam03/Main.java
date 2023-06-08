package sec02.exam03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr[" + i + "] :" + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = 10 * (i + 1);
		}
		for(int i = 0; i<3; i++) {
			System.out.println("arr1[" + i + "] :" + arr1[i]);
		}
		
		
		
		double[ ] arr2 = new double[3];
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = (double) (i + 1)/10;
			//System.out.println("arr2[" + i + "] : " + arr2[i]);
			System.out.printf("arr2[%d] : %.1f/n",i,arr2[i]);
		}
		
		
		

	}

}
