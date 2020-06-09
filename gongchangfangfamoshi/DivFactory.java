package gongchangfangfamoshi;

import java.rmi.server.Operation;

import shejimoshi.OperationDiv;

public class DivFactory implements IFactory
{
	public OperationDiv createOperation()
	{
		return new OperationDiv();
	}

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return null;
	}
}