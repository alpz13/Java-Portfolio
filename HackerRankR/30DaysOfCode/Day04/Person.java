
public class Person {
    private int age;	
  
	public Person(int initialAge) {
         if(initialAge > 0 ){
                age = initialAge;
          } else {
               System.out.println("Age is not valid, setting age to 0.");
             age = 0;
          }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(this.age < 13){
            System.out.println("You are young.");
        } else if(age < 18){
             System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
        //System.out.println(/*Insert correct print statement here*/);
	}

	public void yearPasses() {
  		// Increment this person's age.
        age++;
	}
}