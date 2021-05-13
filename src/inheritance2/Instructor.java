package inheritance2;

public class Instructor extends User {
	private String proffesion;

	
	public Instructor() {
	}


	public Instructor(int id, String firstName, String lastName, String email, String username, String password, String proffesion) {
		super(id,firstName,lastName,email,username,password);
		this.proffesion = proffesion;
	}


	public String getProffesion() {
		return proffesion;
	}


	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}
	
	
}
