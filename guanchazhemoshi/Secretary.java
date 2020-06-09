package guanchazhemoshi;

import java.util.ArrayList;
import java.util.List;

//前台秘书类，把所有的与具体观察者耦合的地方都改为了抽象观察者
public class Secretary
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


/*
//前台秘书类
public class Secretary
{
	private List<StockObserver>	observers	= new ArrayList<StockObserver>();
	private String				action;

	public void attach(StockObserver observer)
	{
		observers.add(observer);
	}

	public void announce()
	{
		for (StockObserver obj : observers)
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
*/


