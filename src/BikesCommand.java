
public class BikesCommand implements Command {

	private Board board;
	
	public BikesCommand(Board board) {
		super();
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.IWantBikes();
	}

}
