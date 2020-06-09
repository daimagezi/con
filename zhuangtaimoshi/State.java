package zhuangtaimoshi;


//State类，抽象状态类，定义一个抽象方法“写程序”
public interface State
{
	public void writeProgram(Work work);

	public void handle(Context context);
}










/*
//State类，抽象状态类，定义一个接口以封装与Context的一个特定状态相关的行为
public interface State
{
	public void handle(Context context);
}
*/




