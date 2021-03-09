package struct;

public class StructTest {
	
	public static void getWarriorStatus(StructEx ac) {
		System.out.println("전사 아이디 조회");
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("체력 : " + ac.hp);
		System.out.println("공격력 : " + ac.atk);
	}
	
	public static void getMagicianStatus(StructEx2 ac) {
		System.out.println("마법사 아이디 조회");
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("체력 : " + ac.hp);
		System.out.println("마나 : " + ac.mp);
		System.out.println("주문력 : " + ac.power);
		
	}
	
	public static void huntMonster(StructEx ac) {
		System.out.println("전사가 몬스터를 잡습니다.");
		ac.hp -= 3;
		ac.level += 1;
	}

	public static void main(String[] args) {
		StructEx w1 = new StructEx();
		
		w1.atk = 3;
		w1.hp = 20;
		w1.level = 1;
		w1.id = "전사1";
		getWarriorStatus(w1);
		
		huntMonster(w1);
		
		getWarriorStatus(w1);
		
		System.out.println();
		
		StructEx w2 = new StructEx();
		
		w2.atk = 5;
		w2.hp = 60;
		w2.level = 3;
		w2.id = "전사2";
		
		getWarriorStatus(w2);
		
		System.out.println();
		
		StructEx2 m1 = new StructEx2();
		
		m1.mp = 10;
		m1.hp = 15;
		m1.power = 3;
		m1.level = 1;
		m1.id = "마법사1";
		
		getMagicianStatus(m1);
	}

}
