package celuemoshi;

public class ConcreteStrategyC implements Strategy
{
	public void algorithmInterface()
	{
		System.out.println("算法C实现");
	}
}
//Context用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用