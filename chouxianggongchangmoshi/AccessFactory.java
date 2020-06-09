package chouxianggongchangmoshi;

//AccessFactory类，实现IFactory接口，实例化AccessUser和AccessDepartment
public class AccessFactory implements IFactory
{
	public IUser createUser()
	{
		return new AccessUser();
	}

	public IDepartment createDepartment()
	{
		return new AccessDepartment();
	}
}

/*
//AccessFactory类，实现IFactory接口，实例化AccessUser
public class AccessFactory implements IFactory
{
	public IUser createUser()
	{
		return new AccessUser();
	}
}
*/
