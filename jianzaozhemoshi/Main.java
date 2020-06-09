package jianzaozhemoshi;


//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		Builder builder1 = new ConcreteBuilder1();
		Builder builder2 = new ConcreteBuilder2();

		Director director = new Director();
		director.construct(builder1);
		director.construct(builder2);

		Product product1 = builder1.getResult();
		Product product2 = builder2.getResult();

		product1.show();
		product2.show();
	}
}

/*
//客户端代码
public class Main extends Frame
{
	public void paint(Graphics g)
	{
		Color c = g.getColor();
		g.setColor(Color.BLACK);

		PersonThinBuilder ptb = new PersonThinBuilder(g);
		PersonDirector pdThin = new PersonDirector(ptb);
		pdThin.createPerson();

		g.setColor(c);
	}

	public void lauchFrame()
	{
		this.setLocation(400, 300);
		this.setSize(800, 600);

		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		this.setBackground(Color.WHITE);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Main drawPerson = new Main();
		drawPerson.lauchFrame();
	}
}
*/

/*
//客户端代码
public class Main extends Frame
{
	public void paint(Graphics g)
	{
		PersonThinBuilder p = new PersonThinBuilder(g);
		p.build();
	}

	public void lauchFrame()
	{
		this.setLocation(400, 300);
		this.setSize(800, 600);

		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		this.setBackground(Color.WHITE);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Main drawPerson = new Main();
		drawPerson.lauchFrame();
	}
}
*/