package ingeritance;

public class Monster {
	int atack;
	int health;
	
	public void doAtack() {
		System.out.println("몬스터가 " + atack + "만큼 공격한다!");
	}
	
	public void info() {
		System.out.println("몬스터의 공격력은" + atack + "이고 체력은" + health + "이다.");
	}
	
}
