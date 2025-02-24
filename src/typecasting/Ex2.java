package typecasting;

public class Ex2 {
	public static void Main(String args[]) {
		VIPCustomer2 vip = new VIPCustomer2("박상민");
		
		vip.showInfo();
	}
}

class Customer2 {
	String customerName;
	String customerGrade; 
	double bonusPoint;
	double bonusRatio;

	public Customer2(String name) {
		this.customerName = name;
		customerGrade = "SILVER"; 
		bonusRatio = 0.01;
		System.out.println("Customer(String) 생성자 호출");
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer2 extends Customer2 {

	double saleRatio;

	public VIPCustomer2(String customerName) {
		//부모클래스에 기본생성자가 없기때문에 에러가 남
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");

	}
}