package code;


public class StringIspalindrome {
	public static void main(String[] args)
	{
		String str1="121";
		StringBuilder str=new StringBuilder(str1);
		str.reverse();
		String str2 = str.toString();
		if(str1.equals(str2))
		{
			System.out.println("Palindrome");
		}
		else
		{
		System.out.println("NotAPalindrome");
	}
	
	}
}
