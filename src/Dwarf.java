

public class Dwarf implements Observer{


	private String name;
	private Observable board;

	public Dwarf(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.board == null) {
			System.out.println("No toy set");
			return;
		}
		String lastToy = this.board.getUpdate();
		System.out.println(this.name + " makes: " + lastToy);
	}

	@Override
	public void setBoard(Observable board) {
		this.board = board;
	}
	

}
