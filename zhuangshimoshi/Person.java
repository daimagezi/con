package zhuangshimoshi;

public class Person
{
	private String	name;

	public Person()
	{
	}

	public Person(String name)
	{
		this.name = name;
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}
/*
//服饰类（Decorator）
public class Finery extends Person
{
	protected Person	component;

	public void decorate(Person component)
	{
		this.component = component;
	}

	public void show()
	{
		if (null != component)
		{
			component.show();
		}
	}
}
//具体服饰类（ConcreteDecorator）
public class TShirts extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("大T恤");
	}
}
public class BigTrouser extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("大裤衩");
	}
}
public class Sneakers extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("破球鞋");
	}
}
public class Suit extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("西装");
	}
}
public class Tie extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("领带");
	}
}
public class LeatherShoes extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("皮鞋");
	}
}
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Person person = new Person("小菜");

		System.out.println("第一种装扮：");

		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();

		pqx.decorate(person);
		kk.decorate(pqx);
		dtx.decorate(kk);
		dtx.show();

		System.out.println("第二种装扮：");
		
		LeatherShoes px = new LeatherShoes();
		Tie ld = new Tie();
		Suit xz = new Suit();

		px.decorate(person);
		ld.decorate(px);
		xz.decorate(ld);
		xz.show();
	}
}
*/


/*
public class Person
{
	private String	name;

	public Person(String name)
	{
		this.name = name;
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}
*/



/*
public class Person
{
	private String	name;

	public Person(String name)
	{
		this.name = name;
	}

	public void wearTShirts()
	{
		System.out.println("大T恤");
	}

	public void wearBigTrouser()
	{
		System.out.println("大裤衩");
	}

	public void wearSneakers()
	{
		System.out.println("破球鞋");
	}

	public void wearSuit()
	{
		System.out.println("西装");
	}

	public void wearTie()
	{
		System.out.println("领带");
	}

	public void wearLeatherShoes()
	{
		System.out.println("皮鞋");
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}
//客户端代码
*/



