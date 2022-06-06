
public class DollsCommand implements Command{

	public DollsCommand(Board board) {
		super();
		this.board = board;
	}

	private Board board;
	
	@Override
	public void execute() {
		this.board.IWantDolls();
		
	}

}
