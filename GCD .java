package code;

//import java.util.Scanner;


public class GCD {

	public static void main(String[] args)
	{
		//Taking input from user
			/*	Scanner s = new Scanner(System.in);
				System.out.println("Enter a number");
				int n1 = s.nextInt();
				System.out.println("Enter a number");
				int n2 = s.nextInt();		
				System.out.println("GCD OF N1 AND N2 IS "+gcd(n1,n2));
			

			}
		public static int gcd(int a ,int b)
		{
			while(b!=0)
			{
				int temp = b;
				b = a%b;
				a = temp;
			
			}
			return a;*/
		//1st method
	/*	int a=25;
		int b=75;
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(a);
		*/
		//2nd method
		int a=25;
		int b=75;
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		System.out.println("GCD of a and b is:"+ b);
		
		}
		}
