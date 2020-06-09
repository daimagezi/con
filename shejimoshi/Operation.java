package shejimoshi;

public class Operation
{
	private double	numberA	= 0;
	private double	numberB	= 0;

	public double getResult() throws Exception
	{
		double result = 0;
		return result;
	}

	public double getNumberA()
	{
		return numberA;
	}

	public void setNumberA(double numberA)
	{
		this.numberA = numberA;
	}

	public double getNumberB()
	{
		return numberB;
	}

	public void setNumberB(double numberB)
	{
		this.numberB = numberB;
	}
}

/*
public class Operation
{
	public static double getResult(double numberA, double numberB,
			String operator)
	{
		double result = 0;
		
		if ("+".equals(operator))
			result = numberA + numberB;
		else if ("-".equals(operator))
			result = numberA - numberB;
		else if ("*".equals(operator))
			result = numberA * numberB;
		else if ("/".equals(operator))
			result = numberA / numberB;

		return result;
	}
}
*/

/*
public class Operation
{
	public static double getResult(double numberA, double numberB,
			String operator)
	{
		double result = 0;
		
		if ("+".equals(operator))
			result = numberA + numberB;
		else if ("-".equals(operator))
			result = numberA - numberB;
		else if ("*".equals(operator))
			result = numberA * numberB;
		else if ("/".equals(operator))
			result = numberA / numberB;

		return result;
	}
}
*/