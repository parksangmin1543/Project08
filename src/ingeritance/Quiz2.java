package ingeritance;

public class Quiz2 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Stv sTv = new Stv();
		
		tv.power = "on";
		tv.channel = 7;
		tv.volume = 10;

		sTv.power = "on";
		sTv.channel = 7;
		sTv.volume = 10;
		sTv.ip = "101.168.9.111";
		
		tv.showInfo();
		sTv.showInfo();
		
	}
}

class Tv {
	String power;
	int channel;
	int volume;
	
	public void showInfo() {
		System.out.println(power + " " + channel + " " + volume) ;
	}
}

class Stv extends Tv {
	String ip;
	
	public void showInfo() {
		System.out.println(power + " " + channel + " " + volume + " " + ip) ;
	}
}

