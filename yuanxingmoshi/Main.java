package yuanxingmoshi;

//客户端代码保持不变
public class Main
{
	public static void main(String[] args)
	{
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = a.clone();
		b.setWorkExperience("1998-2006", "YY企业");

		Resume c = a.clone();
		c.setWorkExperience("1998-2003", "ZZ企业");

		a.display();
		b.display();
		c.display();
	}
}

/*
//客户端代码
public class Main
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = a.clone();
		b.setWorkExperience("1998-2006", "YY企业");

		Resume c = a.clone();
		c.setWorkExperience("1998-2003", "ZZ企业");

		a.display();
		b.display();
		c.display();
	}
}
*/

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = a.clone();
		b.setWorkExperience("1998-2006", "YY企业");

		Resume c = a.clone();
		c.setPersonalInfo("男", "24");

		a.display();
		b.display();
		c.display();
	}
}
*/

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		ConcretePrototype1 p1 = new ConcretePrototype1("I");
		ConcretePrototype1 c1 = (ConcretePrototype1) p1.clonePrototype();

		System.out.println("Cloned:" + c1.getId());
	}
}
*/

/*
public class Main
{
	public static void main(String[] args)
	{
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = a;
		Resume c = a;

		a.display();
		b.display();
		c.display();
	}
}
*/

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");

		Resume b = new Resume("大鸟");
		b.setPersonalInfo("男", "29");
		b.setWorkExperience("1998-2000", "XX公司");

		Resume c = new Resume("大鸟");
		c.setPersonalInfo("男", "29");
		c.setWorkExperience("1998-2000", "XX公司");

		a.display();
		b.display();
		c.display();
	}
}
*/