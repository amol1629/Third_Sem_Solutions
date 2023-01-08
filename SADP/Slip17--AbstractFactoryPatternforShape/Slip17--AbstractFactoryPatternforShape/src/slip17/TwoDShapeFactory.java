package slip17;

public class TwoDShapeFactory extends ShapeFactory{

	@Override
	public Shape createShape(String name) {
		if(name.equals("circle")) {
			return new CircleShape();
		}
		
		return null;
	}

}
