package week1.day1;

public class Car {
	public void openTheDoor() {
		System.out.println("openingTheDoor");
	}
	public void applyBreak() {
		System.out.println("applyingbreak");
	}
	public void applyGear() {
		System.out.println("applyingGear");
	}
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
	public void applyAccelerate() {
		System.out.println("applyAccelerate");
	}
	public void playMusic() {
		System.out.println("playingMusic");
	}
	public static void main(String[] args) {
		Car Tata=new Car();
		Tata.openTheDoor();
		Tata.applyBreak();
		Tata.applyGear();
		Tata.applyAccelerate();
		Tata.switchOnAc();
		Tata.playMusic();
	}

}
