package zhuangtaimoshi;

//客户端代码，没有任何改动。但我们的程序却更加灵活易变了。
public class Main
{
	public static void main(String[] args)
	{
		Work work = new Work();
		work.setHour(9);
		work.writeProgram();
		work.setHour(10);
		work.writeProgram();
		work.setHour(12);
		work.writeProgram();
		work.setHour(13);
		work.writeProgram();
		work.setHour(14);
		work.writeProgram();
		work.setHour(17);

		work.setFinish(true);
		work.writeProgram();
		work.setHour(19);
		work.writeProgram();
		work.setHour(22);
		work.writeProgram();
	}
}


/*
结果显示：
当前时间：9点 上午工作，精神百倍
当前时间：10点 上午工作，精神百倍
当前时间：12点 饿了，午饭，犯困，午休
当前时间：13点 下午状态还不错，继续努力
当前时间：14点 下午状态还不错，继续努力
当前时间：17点 下班回家了
当前时间：19点 下班回家了
当前时间：22点 下班回家了


/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Context context = new Context(new ConcreteStateA());

		context.request();
		context.request();
		context.request();
		context.request();
	}
}


/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Work work = new Work();
		work.setHour(9);
		work.writeProgram();
		work.setHour(10);
		work.writeProgram();
		work.setHour(12);
		work.writeProgram();
		work.setHour(13);
		work.writeProgram();
		work.setHour(14);
		work.writeProgram();
		work.setHour(17);

		work.setFinish(true);
		work.writeProgram();
		work.setHour(19);
		work.writeProgram();
		work.setHour(22);
		work.writeProgram();
	}
}
*/

/*
运行结果：
当前时间：9点 上午工作，精神百倍
当前时间：10点 上午工作，精神百倍
当前时间：12点 饿了，午饭，犯困，午休
当前时间：13点 下午状态还不错，继续努力
当前时间：14点 下午状态还不错，继续努力
当前时间：17点 下班回家了
当前时间：19点 下班回家了
当前时间：22点 下班回家了
*/

/*
public class Main
{
	static int		hour			= 0;
	static Boolean	workFinished	= false;

	public static void writeProgram()
	{
		if (hour < 12)
		{
			System.out.println("当前时间：" + hour + "点 上午工作，精神百倍");
		}
		else if (hour < 13)
		{
			System.out.println("当前时间：" + hour + "点 饿了，午饭，犯困，午休");
		}
		else if (hour < 17)
		{
			System.out.println("当前时间：" + hour + "点 下午状态还不错，继续努力");
		}
		else
		{
			if (workFinished)
			{
				System.out.println("当前时间：" + hour + "点 下班回家了");
			}
			else
			{
				if (hour < 21)
				{
					System.out.println("当前时间：" + hour + "点 加班啊，疲惫至极");
				}
				else
				{
					System.out.println("当前时间：" + hour + "点 扛不住了，睡着了");
				}
			}
		}
	}

	public static void main(String[] args)
	{
		hour =9;
		writeProgram();
		hour =10;
		writeProgram();
		hour =12;
		writeProgram();
		hour =13;
		writeProgram();
		hour =14;
		writeProgram();
		hour =17;
		
		workFinished=true;
		writeProgram();
		hour =19;
		writeProgram();
		hour =22;
		writeProgram();
	}
}
*/
