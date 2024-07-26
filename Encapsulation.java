package code;

public class Encapsulation {
private String studentname;
private int studentid;
private String studentemail;

	public String getStudentname() {
	return studentname;
}

public void setStudentname(String studentname) {
	this.studentname = studentname;
}

public int getStudentid() {
	return studentid;
}

public void setStudentid(int studentid) {
	this.studentid = studentid;
}

public String getStudentemail() {
	return studentemail;
}

public void setStudentemail(String studentemail) {
	this.studentemail = studentemail;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ec = new Encapsulation ();
		ec.setStudentname("Ananya");
		ec.setStudentid(23);
		ec.setStudentemail("ananya@gmail.com");
		System.out.println(ec.getStudentname());
		System.out.println(ec.getStudentid());
		System.out.println(ec.getStudentemail());

	}

}
