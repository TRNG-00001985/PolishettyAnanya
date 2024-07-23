package code;

public class GreaterOrLesser {
	public static void main(String[] args)
	{
		int a=5,b=10,c=15;
		/*if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
*/
		if(a>b && a>c)
		{
			System.out.println("a is greater");	
		}
		else if(b>c && b>a)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
}
}
