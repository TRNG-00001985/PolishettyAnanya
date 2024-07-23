package code;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		if(a%3==0&&a%5==0)
		{
			System.out.println("FIZZBUZZ");
		}
		else if(a%3==0)
		{
			System.out.println("FIZZ");
		}
		else if(a%5==0)
		{
			System.out.println("BUZZ");
		}
		else
		{
			System.out.println(a);
		}
		

	}

}
