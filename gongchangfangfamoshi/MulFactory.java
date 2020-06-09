package gongchangfangfamoshi;

import java.rmi.server.Operation;

import shejimoshi.OperationMul;

public class MulFactory implements IFactory
{
	public OperationMul createOperation()
	{
		return new OperationMul();
	}

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return null;
	}
}