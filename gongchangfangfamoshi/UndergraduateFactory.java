package gongchangfangfamoshi;

public class UndergraduateFactory implements IFactory
{
	public LeiFeng createLeiFeng()
	{
		return new Undergraduate();
	}
}

