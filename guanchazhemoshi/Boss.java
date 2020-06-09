package guanchazhemoshi;

import java.util.ArrayList;
import java.util.List;

//具体的通知者类可能是前台，也可能是老板，它们也许有各自的一些方法，但对于通知者来说，它们是一样的，所以它们都去实现这个接口。
public class Boss implements Subject1
{
	private List<Observer>	observers	= new ArrayList<Observer>();
	private String			action;

	public void attach(Observer observer)
	{
		observers.add(observer);
	}

	public void detach(Observer observer)
	{
		observers.remove(observer);
	}

	public void announce()
	{
		for (Observer obj : observers)
		{
			obj.update();
		}
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}
}
