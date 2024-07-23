package code;

public class LEAPYEAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int yr=1997;
if((yr%4==0)&&(yr%100!=0)||(yr%400==0))
{
	System.out.println("LeapYear");
}
else
{
	System.out.println("Not a LeapYear");	
}
	}

}
