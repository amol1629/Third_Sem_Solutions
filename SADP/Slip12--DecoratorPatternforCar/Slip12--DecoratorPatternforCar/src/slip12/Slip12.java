package slip12;

public class Slip12 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.assemble();
		
		driver.setCar(driver.getLuxury());
		driver.assemble();
		
	}
}
