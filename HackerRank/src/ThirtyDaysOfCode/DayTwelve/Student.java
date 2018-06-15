package ThirtyDaysOfCode.DayTwelve;

public class Student extends Person {
	
	public int[] testScores;

	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.testScores = scores;
	}
	
	public char calculate(int[] scores) {
		int avg = findAverage(scores);
		if(avg < 40) {
			return 'T';
		}
		if(avg < 55) {
			return 'D';
		}
		if(avg < 70) {
			return 'P';
		}
		if(avg < 80) {
			return 'A';
		}
		if(avg < 90) {
			return 'E';
		} else {
			return 'O';
		}
		
	}
	
	private int findAverage(int[] scores) {
		int avg  = 0;
		for(int i = 0; i < scores.length ; i++) {
			avg += scores[i];
		}
		return (int)(avg / (double) scores.length);
	}
	
	@Override
	public void printPerson() {
		super.printPerson();
		System.out.println("Grade: " + calculate(this.testScores));
		
	}
	
	
}
