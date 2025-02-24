package override;

public class Quiz3 {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		Computer computer2 = new Notebook();
		computer2.on();
		computer2.off();
		Computer computer3 = new Desktop();
		computer3.on();
		computer3.off();
	}
}

class Computer {
	String computer;
	
	public Computer() {
		this.computer = "컴퓨터";
	}
	
	public void on() { 
		System.out.println(computer +"를 켭니다") ;
	}
	public void off() { 
		System.out.println(computer +"를 끕니다") ;
	}
}

class Notebook extends Computer {
	String computer;
	
	public Notebook() {
		this.computer = "노트북";
	}
	
	public void on() { 
//		super.on();
		System.out.println(computer +"를 켭니다") ;
	}
	public void off() { 
//		super.off();
		System.out.println(computer +"를 끕니다") ;
	}
}
class Desktop extends Computer {
	String computer;
	
	public Desktop() {
		this.computer = "데스크탑";
	}
	
	public void on() { 
//		super.on();
		System.out.println(computer +"를 켭니다") ;
	}
	public void off() { 
//		super.off();
		System.out.println(computer +"를 끕니다") ;
	}
}

