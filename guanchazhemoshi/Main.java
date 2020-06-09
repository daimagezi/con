package guanchazhemoshi;

//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		ConcreteSubject s = new ConcreteSubject();

		s.attach(new ConcreteObserver("X", s));
		s.attach(new ConcreteObserver("Y", s));
		s.attach(new ConcreteObserver("Z", s));

		s.setSubjectState("ABC");
		s.announce();
	}
}



/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		// 老板胡汉三
		Boss huhansan = new Boss();

		// 看股票的同事
		StockObserver tongshi1 = new StockObserver("魏关姹", huhansan);

		// 看NBA的同事
		NBAObserver tongshi2 = new NBAObserver("易管查", huhansan);

		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);

		huhansan.detach(tongshi1);

		// 老板回来了
		huhansan.setAction("我胡汉三回来了！");

		huhansan.announce();
	}
}
运行结果：
我胡汉三回来了！	易管查关闭NBA直播，继续工作！
*/

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		// 前台小组童子喆
		Secretary tongzizhe = new Secretary();
		
		// 看股票的同事
		StockObserver tongshi1 = new StockObserver("魏关姹", tongzizhe);
		StockObserver tongshi2 = new StockObserver("易管查", tongzizhe);
		
		//前台记下了两位同事
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		//发现老板回来
		tongzizhe.setAction("老板回来了!");
		
		//通知两个同事
		tongzizhe.announce();
	}
}
运行结果：
老板回来了!	魏关姹关闭股票行情，继续工作！
老板回来了!	易管查关闭股票行情，继续工作！
*/
