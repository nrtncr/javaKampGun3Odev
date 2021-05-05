package gun3Odev;

public class Instructor extends User {
	String firstName;
	String lastName;
	String detail;
	String[] lessons;
	
	public Instructor() {
		
	}
	
	public Instructor(String firstName, String lastName, String detail, String[] lessons) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.detail = detail;
		this.lessons = lessons;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String[] getLessons() {
		return lessons;
	}

	public void setLessons(String[] lessons) {
		this.lessons = lessons;
	}
	
	
	
}
