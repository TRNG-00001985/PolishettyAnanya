package code;
                       //method overloading
public class ClassRoom {
	int student=25;
	public void count() {
		System.out.println("No Of Students:" + student);
		
		
	}
	public void count(String b) {
		System.out.println( student);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassRoom cr=new ClassRoom();
		cr.count();
		cr.count("a");
		
	}

}
