package p320;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplance sa = new SupersonicAirplance();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplance.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplance.NORMAL;
		sa.fly();
		sa.land();

	}

}
