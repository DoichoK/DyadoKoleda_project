

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {
		if(colorName.equals("PURPLE")) {
			return new Purple();
		}
		
		if(colorName == "RED") {
			return new Red();
		}
		System.out.println("there is no such color");
		return null;
	}

	@Override
	Toy getToy(String toyName) {
		return null;
	}

}
