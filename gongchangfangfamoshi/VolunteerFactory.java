package gongchangfangfamoshi;

//社区志愿者工厂
public class VolunteerFactory implements IFactory
{
	public LeiFeng createLeiFeng()
	{
		return new Volunteer();
	}
}