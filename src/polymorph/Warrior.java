package polymorph;

public class Warrior {

	private int hp;
	private int atk;
	private int def;
	
	public Warrior(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public void hunt(Monster mon) {
		if(this.atk < mon.getDef()) {
			System.out.println("몬스터를 공격할 수 없습니다. 전사의 공격력이 몬스터의 방어력보다 낮습니다.");
		} else {			
			int result = mon.getHp() - (this.atk - mon.getDef());
			if(result > 0) {			
				mon.setHp(result);
			} else {
				mon.setHp(0);
				System.out.println("몬스터를 처치하였습니다.");
			}
			if(mon.getAtk() >= this.def) {			
				result = this.hp - (mon.getAtk() - this.def);
				if (result < 0) {
					result = 0;
					System.out.println("플레이어가 사망 하였습니다.");
					this.hp = result;
				} else {				
					this.hp = result;
				}
			} else {
				System.out.println("몬스터가 전사를 공격 할 수 없습니다. 몬스터의 공격력이 전사의 방어력보다 낮습니다.");
				return;
			}
		}
		
	}
	
	public void showHp() {
		System.out.println("전사의 남은 체력 : " + this.hp);
	}
}
