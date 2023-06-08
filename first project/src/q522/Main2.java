package q522;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		 
		String a = (score>=90) ? "점수가 90보다 큽니다. 등급은 a 입니다." : "점수가 90보다 작습니다. 등급은 b 입니다.";
		String b = (score<90) ? "점수가 90보다 작습니다. 등급은 b입니다." : "점수가 90보다 큽니다. 등급은 a 입니다.";
		System.out.println(a);
		System.out.println(b);

	}

}
