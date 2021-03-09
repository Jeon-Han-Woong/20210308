package object;

public class Warrior {
	public int level;
	public int hp;
	public int atk;
	public String id;
	
	public Warrior(String userId) {
		System.out.println("전사 아이디 생성중입니다...");
		this.atk = 3;
		this.level = 1;
		this.hp = 20;
		id = userId;
	}
	
	public void getStatus() {
		System.out.println("아이디: " + id);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
	}
	
	public void huntMonster() {
		System.out.println("사냥을 시작합니다.");
		level += 1;
		hp -= 3;
	}

}
