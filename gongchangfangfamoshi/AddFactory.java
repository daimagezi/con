package gongchangfangfamoshi;

import java.rmi.server.Operation;

import shejimoshi.OperationAdd;

public class AddFactory implements IFactory
{
	public OperationAdd createOperation()
	{
		return new OperationAdd();
	}

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return null;
	}
}