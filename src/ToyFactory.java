

public class ToyFactory extends AbstractFactory {

	@Override
	Color getColor(String colorName) {
		return null;
	}

	@Override
	Toy getToy(String toyName) {
		if(toyName.equals("DOLL")) {
			return new Doll();
		}
		
		if(toyName.equals("BIKE")) {
			return new Bike();
		}
		System.out.println("Unknown toy");
		return null;
	}

}
