package mobanfangfamoshi;

//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		AbstractClass c;

		c = new ConcreteClassA();
		c.templateMethod();

		c = new ConcreteClassB();
		c.templateMethod();
	}
}



/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("学生甲抄的试卷：");
		TestPaper studentA = new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();

		System.out.println("学生乙抄的试卷：");
		TestPaper studentB = new TestPaperB();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}
}
*/

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("学生甲抄的试卷：");
		TestPaperA studentA = new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();

		System.out.println("学生乙抄的试卷：");
		TestPaperA studentB = new TestPaperA();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}
}
*/

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("学生甲抄的试卷：");
		TestPaperA studentA = new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();

		System.out.println("学生乙抄的试卷：");
		TestPaperA studentB = new TestPaperA();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}
}
*/