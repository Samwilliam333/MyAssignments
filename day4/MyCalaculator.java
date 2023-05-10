package week1.day4;

public class MyCalaculator {
	
	public int addTwoNumber(int a ,int b) {
		int c=a=b;
		return c;
	}
	public void subractTwoNumber(int total, int b) {
		int c=total-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		MyCalaculator clac=new MyCalaculator();
		int total = clac.addTwoNumber(100,100);
		System.out.println(total);
		clac.subractTwoNumber(total, 50);
		
				
	}
	

}
