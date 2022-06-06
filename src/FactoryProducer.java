

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryName) {
		
		if(factoryName.equals("TOY")) {
			return new ToyFactory();
		}
		
		if(factoryName.equals("COLOR")) {
			return new ColorFactory();
		}
		
		System.out.println("there is no such factory");
		return null;

	}
	
}
