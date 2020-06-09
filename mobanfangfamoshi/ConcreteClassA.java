package mobanfangfamoshi;

//ConcreteClass，实现父灰所定义的一个或多个抽象方法。每一个AbstractClass都可以有任意多个ConcreteClass与之相对应，而每一个ConcreteClass都可以给出这些抽象方法（也就是顶级逻辑的组成步骤）的不同，从而使得顶级逻辑的实现各不相同。
public class ConcreteClassA extends AbstractClass
{
	@Override
	public void primitiveOperation1()
	{
		System.out.println("具体类A方法1实现");
	}

	@Override
	public void primitiveOperation2()
	{
		System.out.println("具体类A方法2实现");
	}
}