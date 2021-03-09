package polymorph;

public class Orc extends Monster {

	public Orc() {
		this.hp = 10;
		this.atk = 2;
		this.def = 0;
	}
//	
//	public int getHp() {
//		return this.hp;
//	}
//	
//	public int getAtk() {
//		return this.atk;
//	}
//	
//	public int getDef() {
//		return this.def;
//	}
//	
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
//	
	public void showHp() {
		if (this.hp < 0) {
			
			System.out.println("오크의 체력 : " + 0);
		} else {
			System.out.println("오크의 체력 : " + this.hp);
		}
	}
}
