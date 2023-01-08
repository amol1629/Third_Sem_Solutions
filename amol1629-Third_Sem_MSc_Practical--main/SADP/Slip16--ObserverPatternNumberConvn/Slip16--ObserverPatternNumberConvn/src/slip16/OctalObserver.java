package slip16;

public class OctalObserver implements Observer{

	@Override
	public void notifed(Subject s) {
		int number = s.getNumber();
		System.out.println("Valued Changed ( Octal ) :" +Integer.toOctalString(number));
		
	}

}
