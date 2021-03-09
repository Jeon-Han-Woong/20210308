package polymorph;

public class Monster {
	
	protected int hp;
	protected int atk;
	protected int def;

	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public int getDef() {
		return this.def;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void showHp() {
		System.out.println("몬스터의 체력 : " + this.hp);
	}
}
