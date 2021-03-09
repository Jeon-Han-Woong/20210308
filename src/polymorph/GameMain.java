package polymorph;

public class GameMain {

	public static void main(String[] args) {
		Warrior w1 = new Warrior(200, 20, 10);
		
		Orc o1 = new Orc();
		Orc o2 = new Orc();
		Dragon d1 = new Dragon();
		
		
		w1.hunt(o1);
		
		w1.hunt(d1);
		
		w1.showHp();
		o1.showHp();
		o2.showHp();
		d1.showHp();
	}
	
}
