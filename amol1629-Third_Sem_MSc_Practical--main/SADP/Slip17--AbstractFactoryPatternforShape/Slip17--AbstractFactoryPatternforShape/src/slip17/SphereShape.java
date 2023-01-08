package slip17;

public class SphereShape implements Shape{
	String name;
	
	public SphereShape() {
		name = "Sphere";
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing 3D " + name);
		
	}

}
