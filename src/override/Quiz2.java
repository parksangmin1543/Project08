package override;

public class Quiz2 {

	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.taste();
		Coffee coffee2 = new Americano();
		coffee2.taste();
		Coffee coffee3 = new CafeLatte();
		coffee3.taste();
	}
}

class Coffee {
	String coffee;
	
	public void taste() { 
		coffee = "커피";
		System.out.println(coffee +"를 마신다") ;
	}
}

class Americano extends Coffee {
	String coffee;
	
	public void taste() { 
		coffee = "아메리카노";
		System.out.println(coffee + "를 마신다") ;
	}
}
class CafeLatte extends Coffee {
	String coffee;
	
	public void taste() { 
		coffee = "카페라떼";
		System.out.println(coffee +"를 마신다") ;
	}
}

