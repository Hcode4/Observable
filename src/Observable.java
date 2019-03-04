
public interface Observable {
	public void addObserver(Observer observable);
	public void notifyObservers(String context);
}
