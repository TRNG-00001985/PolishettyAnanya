package code;

public class Octtohex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String octalNumber="01f";
		//convert octal to decimal
		int decimalNumber=Integer.parseInt(octalNumber,8);
		//convert decimal to hexadecimal
		String hexadecimalNumber=Integer.toHexString(decimalNumber).toUpperCase();
		System.out.println("octal number"+octalNumber);
		System.out.println("hexadecimalNumber"+hexadecimalNumber);
	}

}
