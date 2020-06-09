package gongchangfangfamoshi;

//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();

		student.buyRice();
		student.sweep();
		student.wash();
	}
}

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		LeiFeng xueleifeng = new Undergraduate();

		xueleifeng.buyRice();
		xueleifeng.sweep();
		xueleifeng.wash();
	}
}
*/

/*
//客户端的代码
public class Main
{
	public static void main(String[] args)
	{
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.createOperation();

		oper.setNumberA(1);
		oper.setNumberB(2);

		try
		{
			double result = oper.getResult();
			System.out.println("结果是:" + result);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
*/