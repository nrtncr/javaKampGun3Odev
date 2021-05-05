package gun3Odev;

public class Student {
	String firstName;
	String lastName;
	String[] attendClasses;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String[] attendClasses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.attendClasses = attendClasses;
		
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

	public String[] getAttendClasses() {
		return attendClasses;
	}

	public void setAttendClasses(String[] attendClasses) {
		this.attendClasses = attendClasses;
	}

	
	
	
}
