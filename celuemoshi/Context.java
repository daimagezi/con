package celuemoshi;

public class Context
{
	private Strategy	strategy;

	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public void contextInterface()
	{
		strategy.algorithmInterface();
	}
}
//客户端代码
