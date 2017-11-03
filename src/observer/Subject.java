package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	//保存观察者的结合
	private List<Observer> list = new ArrayList<Observer>();
	
	//观察者注册
	public void register(Observer observer){
		list.add(observer);
	}
	//观察者注销
	public void cancel(Observer observer){
		list.remove(observer);
	}
	//通知所有注册的观察者
	public void notifyObservers(String message){
		for(Observer observer:list){
			observer.update(message);
		}
	}
	
}
