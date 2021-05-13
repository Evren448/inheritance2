package inheritance2;

public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println("Egitmen eklendi : " + " "+ instructor.getFirstName());
		
	}
	
	public void addCourse() {
		System.out.println("Ders Eklendi");
	}
	
	public void deleteCourse() {

		System.out.println("Ders Silindi");
		
	}
}
