package week1.day2;

public class Mobile {
	String mobileBrandName="vivo";
	char mobileLogo='v';
	short noOfMobilePiece=35;
	int modelNumber=21;
	long mobilemeiNumber=5669487L;
	float mobilePrice=2565.00F;
	boolean isDamaged=false;
	public static void main(String[] args) {
		Mobile vivo=new Mobile();
		System.out.println(vivo.mobileBrandName);
		System.out.println(vivo.mobileLogo);
		System.out.println(vivo.noOfMobilePiece);
		System.out.println(vivo.mobilemeiNumber);
		System.out.println(vivo.mobilePrice);
		System.out.println(vivo.isDamaged);	
	}

}
