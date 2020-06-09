package guanchazhemoshi;



//看股票的同事
class StockObserver
{
    private String name;
    private Subject sub;
    public StockObserver(String name, Subject sub)
    {
        this.name = name;
        this.sub = sub;
    }

    //关闭股票行情
    public void CloseStockMarket()
    {
        Console.WriteLine("{0} {1} 关闭股票行情，继续工作！", sub.SubjectState, name);
    }
}






/*
//对于具体的观察者，需要更改的地方就是把与‘前台’耦合的地方都改成针对抽象的通知者
public class StockObserver extends Observer
{
	public StockObserver(String name, Subject sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
	}
}
public class NBAObserver extends Observer
{
	public NBAObserver(String name, Subject sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");
	}
}
*/
/*
//两个具体的观察者，继承抽象观察者，对于update的方法做重写操作
public class StockObserver extends Observer
{
	public StockObserver(String name, Secretary sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
	}
}
public class NBAObserver extends Observer
{
	public NBAObserver(String name, Secretary sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");
	}
}
*/
/*
//看股票同事类
public class StockObserver
{
	private String		name;
	private Secretary	sub;

	public StockObserver(String name, Secretary sub)
	{
		this.name = name;
		this.sub = sub;
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
	}
}
*/