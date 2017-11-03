package observer;

public class ConcreteObserver implements Observer{

	private String name;
	public ConcreteObserver(String name){
		this.name = name;
	}
	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		System.out.println(name+"收到"+state);
	}

}
