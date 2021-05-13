package inheritance2;

public class StudentManager extends UserManager{
	public void gradeStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adli ogrencinin notu: " + student.getGrade());
	}
}
