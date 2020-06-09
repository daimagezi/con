package chouxianggongchangmoshi;

//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		User user = new User();
		Department department = new Department();

		IUser iu = DataAccess.createUser();

		iu.insert(user);
		iu.getUser(1);

		IDepartment id = DataAccess.createDepartment();

		id.insert(department);
		id.getDepartment(1);
	}
}


/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		User user = new User();
		Department department = new Department();

		// IFactory factory = new SqlServerFactory();
		
		IFactory factory = new AccessFactory();

		IUser iu = factory.createUser();

		iu.insert(user);
		iu.getUser(1);

		IDepartment id = factory.createDepartment();

		id.insert(department);
		id.getDepartment(1);
	}
}
结果显示：
在Access中给User表增加一条记录
在Access中根据ID得到User表一条记录
在Access中给Deaprtment表增加一条记录
在Access中根据ID得到Deaprtment表一条记录
*/

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		User user = new User();

		IFactory factory = new SqlServerFactory();

		IUser iu = factory.createUser();

		iu.insert(user);
		iu.getUser(1);
	}
}
*/

/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		User user = new User();

		SqlServerUser su = new SqlServerUser();

		su.insert(user);

		su.getUser(1);
	}
}
*/
