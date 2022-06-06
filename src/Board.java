import java.util.ArrayList;
import java.util.List;

public class Board implements Observable{
	
	private List<Observer> observers;
	private String toy;
	
	public Board() {
		this.observers = new ArrayList<>();
	}
	
	public void setToy(String toy) {
		this.toy = toy;
		this.notifyObservers();
	}
	
	public void IWantDolls() {
		System.out.println("A Doll appears on the board");
	}
	
	public void IWantBikes() {
		System.out.println("A Bike appears on the board");
	}

	

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setBoard(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		observer.setBoard(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.toy;
	}

	
}
