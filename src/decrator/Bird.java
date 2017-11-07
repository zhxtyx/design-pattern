package decrator;

public class Bird extends Change{

	public Bird(TheGreatestSage sage){
		super(sage);
	}
	public void move(){
		System.out.println("变成了鸟");
	}
}
