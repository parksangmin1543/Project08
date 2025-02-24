package typecasting;

public class Ex1 {

	public static void main(String[] args) {
		VIPCustomer vip = new VIPCustomer();
		
		// 부모 클래스의 생성자가 호출될때 , 이름/등급/포인트/적립률 속성이 생성됨
		// 자식 클래스의 생성자가 호출될때, 할인률 속성이 생성됨
		// 따라서 VIP는 총 5개의 속성을 가지게됨
	}

}

//일반회원 클래스
class Customer {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률

	public Customer() {
		customerGrade = "SILVER"; //고정값이니까 초기화
		bonusRatio = 0.01;
		System.out.println("Customer 생성자 호출");
	}

	// 보인스 포인트 적립하고, 지불 가격을 계산하는 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio); // 보너스 포인트 계산
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

//VIP 회원 클래스
class VIPCustomer extends Customer { // 상속받기

	double saleRatio; // 할인률

	public VIPCustomer() {
		// super는 부모를 가리키는 키워드이다.
		// super()는 생략할 수 있다. (없으면 컴파일러가 자동으로 생성함)
		super(); // 부모의 생성자를 호출한다.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");
		
//		super();
//		super() 코드는 생성자의 첫번째 중에만 작성가능하다.
	}

}