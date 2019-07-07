
public class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	public Person() {
		
	}
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = id;
	}
	
	public void printPerson() {
	 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}

}
