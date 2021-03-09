package object;

public class Magician {
	public int level;
	public int hp;
	public int mp;
	public int def;
	public String id;
	
	
	public Magician(String userId) {
		System.out.println("마법사 아이디 생성중입니다...");
		this.def = 3;
		this.level = 1;
		this.hp = 20;
		this.mp = 10;
		id = userId;
	}
	
	public void getStatus() {
		System.out.println("아이디: " + id);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
		System.out.println("방어력 : " + def);
	}
	
	public void huntMonster() {
		System.out.println("사냥을 시작합니다.");
		level += 1;
		hp -= 3;
	}
	
	public void healHp() {
		System.out.println("체력을 회복합니다.");
		hp = 20;
	}

}
