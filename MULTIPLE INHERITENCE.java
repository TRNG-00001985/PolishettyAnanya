//MULTIPLE INHERITENCE
package code;
 interface Birds
 {
	 void sound();
	 
 }
 interface insects
 {
	 void fly() ;
	 }
class Bees implements Birds,insects
{
	public void sound()
	{
		System.out.println("Birds makes sound ");
	}
	public void fly()
	{
		System.out.println("Insects can fly");
	}
}









public class inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bees bs=new Bees();
		bs.sound();
		bs.fly();

	}

}
