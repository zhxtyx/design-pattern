package observer;

import java.util.Scanner;

/**
 * 观察者模式 ：定义对象间一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知自动更新。
 * 		      关键点：观察主题包括注册，注销，状态更新通知
 */
public class Client {

	public static void main(String[] args){
		//创建观察者主题
		ConcreteSubject subject = new ConcreteSubject();
		System.out.println("-----------------------------------------------");
		System.out.println("生成100个路人");
		//生成观察者，并注册
		for(int i=0;i<100;i++){
			Observer observer = new ConcreteObserver("路人"+String.valueOf(i));
			subject.register(observer);
		}
		System.out.println("-----------------------------------------------");
		Scanner xx = new Scanner( System.in );
		System.out.print("通知: ");
		String message = xx.next();
		//主题改变，通知观察者
		subject.change(message);
	}
}
