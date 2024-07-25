package code;

public interface Time{
public void second();
public void minutes();
}
class clock implements Time
{
	public void second()
	{
		System.out.println("This is seconds hand");
	}
	public void minutes()
	{
		System.out.println("This is minutes hand");
	}
}
class sample
{
	public static void main(String[] args) {
		clock c=new clock();
		c.second();
		c.minutes();
	}
}
