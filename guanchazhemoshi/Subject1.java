package guanchazhemoshi;

public interface Subject1
{
	void attach(Observer observer);

	void detach(Observer observer);

	void announce();

	String getAction();

	void setAction(String action);
}
