package inheritance2;

public class Student extends User{
	private int classYear;
	private double gno;
	private int grade;
	
	public Student() {
	}
	
	public Student(int id, String firstName, String lastName, String email, String username, String password, int classYear, double gno, int grade) {
		super(id,firstName,lastName,email,username,password);
		this.classYear = classYear;
		this.gno = gno;
		this.grade = grade;
	}

	public int getClassYear() {
		return classYear;
	}

	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}

	public double getGno() {
		return gno;
	}

	public void setGno(double gno) {
		this.gno = gno;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
	
	
}
