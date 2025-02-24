package ingeritance;

public class Quiz1 {

	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		Tiger tiger = new Tiger();
		
		eagle.wing = 2;
		eagle.leg = 2;
		
		tiger.leg = 4;
		tiger.tail = 1;
	}
}

class Animal {
	int leg;
}

class Tiger extends Animal {
	int tail;
}
class Eagle extends Animal {
	int wing;
}


