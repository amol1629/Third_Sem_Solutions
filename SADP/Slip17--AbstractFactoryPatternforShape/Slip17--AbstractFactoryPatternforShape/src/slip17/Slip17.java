package slip17;

public class Slip17 {
	
	public static void main(String[] args) {
		ShapeFactory factory = new TwoDShapeFactory();
		ShapeFactory factory2 = new ThreeDShapeFactory();
		
		Shape s = factory.createShape("circle");
		Shape s2 = factory2.createShape("sphere");
		
		s.draw();
		s2.draw();
	}
	

}
