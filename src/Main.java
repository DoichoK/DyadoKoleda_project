public class Main {

	public static void main(String[] args) {
		
		DyadoKoleda dyado;
		dyado=DyadoKoleda.getDyado();
		Board board = new Board();
		BikesCommand bikesCommand = new BikesCommand(board);
		DollsCommand dollsCommand = new DollsCommand(board);
		Observer djudje = new Dwarf("Pesho");
		Observer djudje2 = new Dwarf("Pesho2");
		
		board.subscribe(djudje);		
		dyado.setCommand(dollsCommand);
		dyado.IWantToy();
		board.setToy("Doll");
		board.unsubscribe(djudje);
		
		AbstractFactory dollFactory = FactoryProducer.getFactory("TOY");
		Toy doll = dollFactory.getToy("DOLL");
		doll.create();
		
		AbstractFactory pinkFactory = FactoryProducer.getFactory("COLOR");
		Color purple = pinkFactory.getColor("PURPLE");
		purple.fill();
		
		board.subscribe(djudje2);
		dyado.setCommand(bikesCommand);
		dyado.IWantToy();
		board.setToy("Bike");
		board.unsubscribe(djudje2);
		
		AbstractFactory bikeFactory = FactoryProducer.getFactory("TOY");
		Toy bike = bikeFactory.getToy("BIKE");
		bike.create();

		AbstractFactory blueFactory = FactoryProducer.getFactory("COLOR");
		Color red = blueFactory.getColor("RED");
		red.fill();
		
		
	}

}