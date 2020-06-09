package yuanxingmoshi;

//工作经历
public class WorkExperience implements Cloneable
{
	private String	workDate;
	private String	company;

	public String getWorkDate()
	{
		return workDate;
	}

	public void setWorkDate(String workDate)
	{
		this.workDate = workDate;
	}

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	public WorkExperience clone()
	{
		try
		{
			return (WorkExperience) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}


/*
结果显示为：
大鸟		男		29
工作经历：1998-2000	XX公司
大鸟		男		29
工作经历：1998-2006	YY企业
大鸟		男		29
工作经历：1998-2003	ZZ企业
*/

/*
//工作经历类
public class WorkExperience
{
	private String	workDate;
	private String	company;

	public String getWorkDate()
	{
		return workDate;
	}

	public void setWorkDate(String workDate)
	{
		this.workDate = workDate;
	}

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}
}
*/

/*
结果显示：
大鸟		男		29
工作经历：1998-2003	ZZ企业
大鸟		男		29
工作经历：1998-2003	ZZ企业
大鸟		男		29
工作经历：1998-2003	ZZ企业
*/