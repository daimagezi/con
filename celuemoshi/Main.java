package celuemoshi;

public class Main
{
	private static double	total	= 0;

	public static void main(String[] args)
	{
		consume("正常收费", 1, 1000);
		consume("满300返100", 1, 1000);
		consume("打8折", 1, 1000);

		System.out.println("总计:" + total);
	}

	public static void consume(String type, int num, double price)
	{
		CashContext cashContext = new CashContext(type);

		double totalPrices = cashContext.acceptCash(num * price);
		total += totalPrices;

		System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
	}
}


/*
public class Main
{
	private static double	total	= 0;

	public static void main(String[] args)
	{
		consume("正常收费", 1, 1000);
		consume("满300返100", 1, 1000);
		consume("打8折", 1, 1000);

		System.out.println("总计:" + total);
	}

	public static void consume(String type, int num, double price)
	{
		CashContext cashContext = null;

		if ("正常收费".equals(type))
		{
			cashContext = new CashContext(new CashNormal());
		}
		else if ("满300返100".equals(type))
		{
			cashContext = new CashContext(new CashReturn(300, 100));
		}
		else if ("打8折".equals(type))
		{
			cashContext = new CashContext(new CashRebate(0.8));
		}

		double totalPrices = cashContext.acceptCash(num * price);
		total += totalPrices;
		
		System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
	}
}
*/

/*
public class Main
{
	public static void main(String[] args)
	{
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}
}
*/

/*
public class Main
{
	private static double	total	= 0;

	public static void main(String[] args)
	{
		consume("正常收费", 1, 1000);
		consume("满300返100", 1, 1000);
		consume("打8折", 1, 1000);

		System.out.println("总计:" + total);
	}

	public static void consume(String type, int num, double price)
	{
		CashSuper csuper = CashFactory.createCash(type);
		double totalPrices = 0;
		totalPrices = csuper.acceptCash(num * price);
		total += totalPrices;
		System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
	}
}
*/