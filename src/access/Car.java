package access;

public class Car {

	private int speed;
	private int gas;
	private String owner;
	
	public Car(int speed, int gas, String owner) {
		this.speed = speed;
		this.gas = gas;
		this.owner = owner;
	}
	
	public void getCarInfo() {
		System.out.println("속력 : " + this.speed);
		System.out.println("연료 : " + this.gas);
		System.out.println("소유자 : " + this.owner);
	}
	
	public void carAccel() {
		if (this.gas > 0) {			
			this.speed += 10;
			this.gas -= 2;
		} else {
			System.out.println("연료가 부족합니다.");
		}
		
	}
	
	public void carBreak() {
		if (this.speed > 0) {
			this.speed -= 10;			
		} else {
			System.out.println("현재 속도에서 더 줄일 수 없습니다.");
		}
		
	}
}
