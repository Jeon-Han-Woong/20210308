
package access;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car(0, 100, "전한웅");
		
		car.getCarInfo();
		car.carAccel();
		car.carAccel();
		car.getCarInfo();
		car.carBreak();
		car.getCarInfo();
		car.carBreak();
		car.carBreak();
		car.getCarInfo();
	}

}
