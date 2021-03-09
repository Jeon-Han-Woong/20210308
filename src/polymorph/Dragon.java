package polymorph;

public class Dragon extends Monster {

	public Dragon() {
		this.hp = 50;
		this.atk = 20;
		this.def = 10;
	}
	
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
	
	public void showHp() {
		if (this.hp < 0) {
			System.out.println("드래곤의 체력 : " + 0);
		} else {
			System.out.println("드래곤의 체력 : " + this.hp);
		}
	}
}
