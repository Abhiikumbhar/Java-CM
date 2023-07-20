class Vehicle{
	private String name;
	private String model;
	
	public Vehicle(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}
	void showVehicle() {
		System.out.println("name :"+ name);
		System.out.println("model :"+ model);
	}
}

class Motercycle extends Vehicle {
	int wheels;
	
	public Motercycle(String name, String model,int wheels) {
		super(name, model);
		this.wheels = wheels;
		// TODO Auto-generated constructor stub
	}

	void showMotercycle () {
		showVehicle();
		System.out.println("Wheels :"+ wheels);
	}
}

class Car extends Vehicle {
	int wheels;
	
	public Car(String name, String model, int wheels) {
		super(name, model);
		this.wheels = wheels;
		// TODO Auto-generated constructor stub
	}

	void showCar() {
		showVehicle();
		System.out.println("Wheels :"+ wheels);
	}
}


public class hierarchical_Inheritance {

	public static void main(String[] args) {
		
		Motercycle bike = new Motercycle("Yahama", "R15",2);
		bike.showMotercycle();		
		Car car = new Car("Audi","R8", 4);
		car.showCar();	
	}
}
