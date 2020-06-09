package shejimoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader stdin = null;
		BufferedReader buffer = null;

		stdin = new InputStreamReader(System.in);
		buffer = new BufferedReader(stdin);

		try
		{
			System.out.print("请输入数字A:");
			double numberA = Double.parseDouble(buffer.readLine());
			System.out.print("请选择运算符(+、-、*、/):");
			String operator = buffer.readLine();
			System.out.print("请输入数字B:");
			double numberB = Double.parseDouble(buffer.readLine());

			Operation oper = OperationFactory.createOperation(operator);
			oper.setNumberA(numberA);
			oper.setNumberB(numberB);
			System.out.println("结果是:" + oper.getResult());
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}


/*
public class Main
{
	public static void main(String[] args)
	{
		InputStreamReader stdin = null;
		BufferedReader bufferReader = null;

		stdin = new InputStreamReader(System.in);
		bufferReader = new BufferedReader(stdin);
		try
		{
			System.out.print("请输入数字A:");
			String numberA = bufferReader.readLine();
			System.out.print("请选择运算符(+、-、*、/):");
			String operator = bufferReader.readLine();
			System.out.print("请输入数字B:");
			String numberB = bufferReader.readLine();

			String result = String.valueOf(Operation.getResult());

			System.out.println("结果是:" + result);
		}
		catch (Exception ex)
		{
			System.out.println("您输入有误:" + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
*/
/*
public class Main
{
	public static void main(String[] args)
	{
		InputStreamReader stdin = null;
		BufferedReader bufferReader = null;

		stdin = new InputStreamReader(System.in);
		bufferReader = new BufferedReader(stdin);
		try
		{
			System.out.print("请输入数字A:");
			String numberA = bufferReader.readLine();
			System.out.print("请选择运算符(+、-、*、/):");
			String operator = bufferReader.readLine();
			System.out.print("请输入数字B:");
			String numberB = bufferReader.readLine();

			String result = String.valueOf(Operation.getResult(Double
					.parseDouble(numberA), Double.parseDouble(numberB),
					operator));

			System.out.println("结果是:" + result);
		}
		catch (Exception ex)
		{
			System.out.println("您输入有误:" + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
*/
