package code;

public class SWAP {

	public static void main(String[] args) {
      int a=2,b=3;
      //using third variable
      /*int temp=a;
      a=b;
      b=temp;
      System.out.println(a + " " +b);*/
      //using bitwise operators
      a=a^b;
      b=a^b;
      a=a^b;
      System.out.println("value of a,b:"+a+" "+b);
     /*
      * 010
      * 011        
      *  
      */
      
   
	}

}
