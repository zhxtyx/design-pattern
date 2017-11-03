package observer;

public class ConcreteSubject extends Subject{
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void change(String newState){
		state = newState;
		this.notifyObservers(state);
	}
}
