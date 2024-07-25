package code;

 abstract class abstractclass {
	 public abstract void call();
 }
 class  normalclass extends abstractclass
{
	 public void call(){
		 System.out.println("I am normal method");
 
}
}
 class demo
 {
	 public static void main(String[] args) {
		normalclass nc=new normalclass();
		nc.call();
	}
 }
