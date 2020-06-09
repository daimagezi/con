package mobanfangfamoshi;

//学生乙抄试卷类
public class TestPaperB extends TestPaper
{
	protected String answer1()
	{
		return "c";
	}

	protected String answer2()
	{
		return "a";
	}

	protected String answer3()
	{
		return "a";
	}
}

/*
//学生乙抄的试卷
public class TestPaperB extends TestPaper
{
	public void testQuestion1()
	{
		super.testQuestion1();
		System.out.println("答案：b");
	}

	public void testQuestion2()
	{
		super.testQuestion2();
		System.out.println("答案：b");
	}

	public void testQuestion3()
	{
		super.testQuestion3();
		System.out.println("答案：b");
	}
}
*/

/*
//学生乙抄的试卷类
public class TestPaperB
{
	public void testQuestion1()
	{
		System.out.println("杨过得到，后来给了郭靖，练成倚天剑、屠龙刀的玄铁可能是[] "
				+ "a.球磨铸铁 b.马口铁 c.高速合金钥 d.碳素纤维");

		System.out.println("答案:d");
	}

	public void testQuestion2()
	{
		System.out.println("杨过、程英、陆无双铲除了情花.造成[] " + "a.使这种植物不再害人 b.使一种珍稀物种灭绝 "
				+ "c.破坏了那个生物圈的生态平衡 d.造成该地区沙漠化");

		System.out.println("答案:b");
	}

	public void testQuestion3()
	{
		System.out.println("蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药[] "
				+ "a.阿司匹林 b.牛黄解毒片 c.氟呱酸 d.让他们喝大量的生牛奶 e.以上全不对");

		System.out.println("答案:a");
	}
}
*/