package slip12;

public class Driver {
	Car car;
	Car sports , luxury;
	public Driver() {
		sports = new SportsCar();
		luxury = new LuxuryCar();
		
		setCar(sports);
	}
	
	public Car getCar() {
		return car;
	}
	
	
	public Car getSport() {
		return sports;
	}
	
	public Car getLuxury() {
		return luxury;
	}
	public void setCar(Car c) {
		this.car = c;
	}
	
	void assemble() {
		car.assemble();
	}
}
