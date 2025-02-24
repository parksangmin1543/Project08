package ingeritance;

public class Quiz4 {

	public static void main(String[] args) {
		Slime slime = new Slime();
		
		slime.atack = 30;
		slime.health = 200;
		slime.skill = "마비";
		
		slime.info();
		slime.doAtack();
		slime.doSkill();
	}
}



