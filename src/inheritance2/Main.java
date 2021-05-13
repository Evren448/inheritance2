package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(1,"first1", "last1", "email1", "user1", "pass1" , 1, 2.34,80);
		Student student2 = new Student(2,"first2", "last2", "email2", "user2", "pass2" , 2, 3.34,100);

		Instructor instructor1 = new Instructor(3,"first3", "last3", "email3", "user3", "pass3" , "Java");
		Instructor instructor2 = new Instructor(4,"first4", "last4", "email4", "user4", "pass4" , "C#");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
		
		Student[] students = {student1,student2};
		userManager.addMultiple(students);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.gradeStudent(student1);


	}

}
