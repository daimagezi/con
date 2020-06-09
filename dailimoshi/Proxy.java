package dailimoshi;

//Proxy类，保存一个引用使用代理可以访问实体，并提供一个与Subject的接口相同的接口，这样的代理可以用替代实体。
public class Proxy implements Subject
{
	RealSubject	realSubject;

	public void request()
	{
		if (null == realSubject)
		{
			realSubject = new RealSubject();
		}
		realSubject.request();
	}
}

/*
//代理类
public class Proxy implements GiveGift
{
	Pursuit	gg;

	public Proxy(SchoolGirl mm)
	{
		gg = new Pursuit(mm);
	}

	public void giveChocolate()
	{
		gg.giveChocolate();
	}

	public void giveDolls()
	{
		gg.giveDolls();
	}

	public void giveFlowers()
	{
		gg.giveFlowers();
	}
}
*/

/*
//代理类
public class Proxy
{
	SchoolGirl	mm;

	public Proxy(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " 送你洋娃娃");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + " 送你鲜花");
	}

	public void giveChocolate()
	{
		System.out.println(mm.name + " 送你巧克力");
	}
}
*/