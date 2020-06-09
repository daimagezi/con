package zhuangtaimoshi;

//中午工作状态
public class NoonState implements State
{
	public void writeProgram(Work work)
	{
		if (work.getHour() < 13)
		{
			System.out.println("当前时间：" + work.getHour() + "点 饿了，午饭，犯困，午休");
		}
		else
		{
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		
	}
}