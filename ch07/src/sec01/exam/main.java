package sec01.exam;

public class main {
	
	public static void main(String[] args) {
		Car car;
		Truck truck = new Truck(80, 200);
		
		car = truck;
		truck.ShowSpeed();
		car.ShowSpeed();
		
		System.out.println("car speed is "
				+ car.speed);
		System.out.println("Truck speed is "
				+ truck.speed);
	}

	
}
