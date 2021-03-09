package polymorph1;

public class GameMain {

	public static void main(String[] args) {
		Warrior w1 = new Warrior(200, 20, 10);
		
		Orc orc1 = new Orc();
		Orc orc2 = new Orc();
		Dragon dra1 = new Dragon();
		Dragon dra2 = new Dragon();
		Troll t1 = new Troll();
		Goblin g1 = new Goblin();
		
		
		w1.hunt(orc1);
		
		w1.hunt(dra1);
		w1.hunt(t1);
		w1.hunt(g1);
		
		w1.showHp();
		orc1.showHp();
		orc2.showHp();
		dra1.showHp();
		t1.showHp();
		g1.showHp();
	}
	
}
