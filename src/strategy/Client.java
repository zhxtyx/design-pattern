package strategy;

import strategy.fight.BoardBrick;
import strategy.fight.FightBehavior;
import strategy.fight.KitchenKnife;
/**
 * 策略模式 ：定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。
 * 		      定义了一系列的揍人方式，并将每一个揍人方式封装起来，而且使它们还可以相互替换。例如有的人拿着菜刀，有的人拿着板砖。 
 */
public class Client {
	//故事背景：明朝末年民不聊生，百姓纷纷揭竿而起
	public static void main(String[] args){
		//拿菜刀
		FightBehavior kitchenKnife = new KitchenKnife();
		//拿板砖
		FightBehavior boardBrick = new BoardBrick();
		
		for(int i=0;i<100;i++){
			Person person = new Person(kitchenKnife,"厨子"+String.valueOf(i));
			person.setWeapon();			
			Person person1 = new Person(boardBrick,"路人"+String.valueOf(i));
			person1.setWeapon();			
		}
			
	}
}
