package zhuangshimoshi;

//Decorator类
public class Decorator implements Component
{
	protected Component	component;

	public void operation()
	{
		if (null != component)
		{
			component.operation();
		}
	}

	public Component getComponent()
	{
		return component;
	}

	public void setComponent(Component component)
	{
		this.component = component;
	}
}