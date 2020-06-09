package gongchangfangfamoshi;

import java.rmi.server.Operation;

import shejimoshi.OperationSub;

public class SubFactory implements IFactory
{
	public OperationSub createOperation()
	{
		return new OperationSub();
	}

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return null;
	}
}