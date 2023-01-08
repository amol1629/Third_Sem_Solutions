package slip16;

public class Slip16 {

	public static void main(String[] args) {
		Subject s = new Subject();
		Observer o = new BinaryObserver();
		s.addObserver(o);
		s.addObserver(new HexaObserver());
		s.addObserver(new OctalObserver());
		s.setNumber(90);
		
		s.removeObserver(o);
		s.setNumber(20);
	}

}
