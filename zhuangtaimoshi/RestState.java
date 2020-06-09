package zhuangtaimoshi;

//下班休息状态
public class RestState implements State
{
	public void writeProgram(Work work)
	{
		System.out.println("当前时间：" + work.getHour() + "点 下班回家了");
	}

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		
	}
}