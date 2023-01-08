package slip16;

public class BinaryObserver implements Observer{

	@Override
	public void notifed(Subject s) {
		int number = s.getNumber();
		System.out.println("Value changed ( Binary ):" + Integer.toBinaryString(number));		
	}

}
