package strategy.fight;
/**
 * 菜刀
 * @author Administrator
 *
 */
public class KitchenKnife implements FightBehavior{

	@Override
	public void action() {
		System.out.println("拿起了菜刀"); 
	}

}
