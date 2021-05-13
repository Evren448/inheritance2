package inheritance2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " 
				+ user.getLastName() + " adli kullanici sisteme eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " 
				+ user.getLastName() + " adli kullanici sistemden cikarildi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
