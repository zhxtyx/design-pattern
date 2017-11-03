package strategy;

import strategy.fight.FightBehavior;
/**
 *人类
 * @author Administrator
 *
 */
public class Person {

	FightBehavior fightBehavior;
	String name;
	
	public Person(FightBehavior fightBehavior,String name){
		this.fightBehavior =  fightBehavior;
		this.name = name;
	}
	
	public void setWeapon(){
		System.out.print(this.name);
		this.fightBehavior.action();
	}
}
