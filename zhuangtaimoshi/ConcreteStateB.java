package zhuangtaimoshi;

public class ConcreteStateB implements State
{
	public void handle(Context context)
	{
		context.setState(new ConcreteStateA());
	}

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		
	}
}