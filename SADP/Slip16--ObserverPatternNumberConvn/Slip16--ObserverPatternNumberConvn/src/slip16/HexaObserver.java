package slip16;

public class HexaObserver implements Observer{
	
	@Override
	public void notifed(Subject s) {
		int number = s.getNumber();	
		System.out.println("Valued Changed (Hex) : " + Integer.toHexString(number));
	}

}
