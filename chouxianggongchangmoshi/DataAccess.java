package chouxianggongchangmoshi;

import java.io.IOException;
import java.util.Properties;

//再解析app.properties来获取DB字段值。
public class DataAccess
{
	private static String		DB			= null;
	private static String		className	= null;
	private static Properties	properties	= new Properties();

	static
	{
		try
		{
			properties.load(DataAccess.class.getClassLoader()
					.getResourceAsStream("config/app.properties"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		DB = properties.getProperty("DB");
	}

	public static IUser createUser()
	{
		return (IUser) create("User");
	}

	public static IDepartment createDepartment()
	{
		return (IDepartment) create("Department");
	}

	public static Object create(String name)
	{
		className = DB + name;

		try
		{
			return Class.forName(className).newInstance();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		return null;
	}
}


/*
//常规的写法
Iuser result = new SqlServerUser();
//反射写法
public class DataAccess
{
	private static final String	db			= "SqlServer";
	private static String		className	= null;

	public static IUser createUser()
	{
		className = db + "User";
		try
		{
			return (IUser) Class.forName(className).newInstance();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public static IDepartment createDepartment()
	{
		className = db + "Department";
		try
		{
			return (IDepartment) Class.forName(className).newInstance();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
*/

/*
//DataAccess类
public class DataAccess
{
	private static final String	db	= "Sqlserver";

	public static IUser createUser()
	{
		IUser result = null;
		if ("Sqlserver".equals(db))
		{
			result = new SqlServerUser();
		}
		else if ("Access".equals(db))
		{
			result = new AccessUser();
		}

		return result;
	}

	public static IDepartment createDepartment()
	{
		IDepartment result = null;
		if ("Sqlserver".equals(db))
		{
			result = new SqlServerDepartment();
		}
		else if ("Access".equals(db))
		{
			result = new AccessDepartment();
		}

		return result;
	}
}
*/
