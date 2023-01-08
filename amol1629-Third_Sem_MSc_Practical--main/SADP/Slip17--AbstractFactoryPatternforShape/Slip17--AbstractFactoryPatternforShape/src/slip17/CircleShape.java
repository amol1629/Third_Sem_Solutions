package slip17;

public class CircleShape implements Shape{
	String name;
	
	public CircleShape() {
		name = "Circle";
	}
	
	@Override
	public void draw() {		
		System.out.println("Drawing 2D " + name);
	}

}
