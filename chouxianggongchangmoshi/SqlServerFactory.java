package chouxianggongchangmoshi;

//SqlServerFactory类，实现IFactory接口，实例化SqlServerUser和SqlServerDepartment
public class SqlServerFactory implements IFactory
{
	public IUser createUser()
	{
		return new SqlServerUser();
	}

	public IDepartment createDepartment()
	{
		return new SqlServerDepartment();
	}
}

/*
//SqlServerFactory类，实现IFactory接口，实例化SqlServerUser
public class SqlServerFactory implements IFactory
{

	public IUser createUser()
	{
		return new SqlServerUser();
	}

}
*/