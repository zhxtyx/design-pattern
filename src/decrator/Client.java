package decrator;
/**
 * 装饰器模式：动态地给一个对象增加一些额外的职责，就增加的功能来说，Decorator模式相比生成子类更加灵活。
 *
 */
public class Client {

	public static void main(String[] args){
		TheGreatestSage sage = new Monkey();
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);
		sage.move();
		bird.move();
	}
}
