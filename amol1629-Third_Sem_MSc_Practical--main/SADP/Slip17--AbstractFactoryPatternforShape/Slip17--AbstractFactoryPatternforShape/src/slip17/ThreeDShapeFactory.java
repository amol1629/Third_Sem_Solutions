package slip17;

public class ThreeDShapeFactory extends ShapeFactory{

	@Override
	public Shape createShape(String name) {
		if(name.equals("sphere")) {
			return new SphereShape();
		}
		return null;
	}

}
