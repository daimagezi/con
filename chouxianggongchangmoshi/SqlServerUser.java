package chouxianggongchangmoshi;

//SqlServerUser类，用于访问SQL Server的User
public class SqlServerUser implements IUser
{
	public void insert(User user)
	{
		System.out.println("在SQL Server中给User表增加一条记录");
	}

	public User getUser(int id)
	{
		System.out.println("在SQL Server中根据ID得到User表一条记录");
		return null;
	}
}

/*
//SqlServerUser类，用于操作User表，假设只有新增用户和得到用户的方法，其余方法以及具体SQL语句省略。
public class SqlServerUser
{
	public void insert(User user)
	{
		System.out.println("在SQL Server中给User表增加一条记录");
	}

	public User getUser(int id)
	{
		System.out.println("在SQL Server中根据ID得到User表一条记录");
		return null;
	}
}
*/
