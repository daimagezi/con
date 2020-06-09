package zhuangshimoshi;

//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConcreteDecoratorB d2 = new ConcreteDecoratorB();

		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
	}
}

/*
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("小菜");

		System.out.println("第一种装扮:");
		Finery dtx = new TShirts();
		Finery kk = new BigTrouser();
		Finery pqx = new Sneakers();

		dtx.show();
		kk.show();
		pqx.show();
		person.show();

		System.out.println("第二种装扮:");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();

		xz.show();
		ld.show();
		px.show();
		person.show();
	}
}
*/

/*
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("小菜");

		System.out.println("第一种装扮:");

		person.wearTShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();

		System.out.println("第二种装扮:");

		person.wearSuit();
		person.wearTie();
		person.wearLeatherShoes();
		person.show();
	}
}
*/