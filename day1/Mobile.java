package week1.day1;

public class Mobile {
	public void unlockThePhone() {
		System.out.println("unlockingThePhone");
	}
	public void sendMessage() {
		System.out.println("sendingMessage");
	}
	public void fileTransfer() {
		System.out.println("fileTransfering");
	}
	public void openTheApp() {
		System.out.println("openingTheApp");
	}
	public void opencamera() {
		System.out.println("openingcamera");
	}
	public void playvideo() {
		System.out.println("playingvideo");
	}
	public void playMusic() {
		System.out.println("playingMusic");
	}
	public void takingPictures() {
		System.out.println("takingPictures");
	}
	public static void main(String[] args) {
		Mobile vivo=new Mobile();
		vivo.unlockThePhone();
		vivo.sendMessage();
		vivo.fileTransfer();
		vivo.openTheApp();
		vivo.opencamera();
		vivo.playvideo();
		vivo.playMusic();
		vivo.takingPictures();
	}

}
