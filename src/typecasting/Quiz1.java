package typecasting;

public class Quiz1 {

	public static void main(String[] args) {
		Child child = new Child("한국", "고", "길동");
		
		Parents pc = new Child("한국", "오", "아리");
		child.showInfo();
		pc.showInfo();
	}
}

class Parents {
	String nationality;
	String lastName;
	
	public Parents(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}
	
	public void showInfo() {
		System.out.println(nationality + " " + lastName);
	}
}

class Child extends Parents{
	String firstName; 
	
	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}
	
	public void showInfo() {
		System.out.println(nationality + " " + lastName + firstName);
	}
}