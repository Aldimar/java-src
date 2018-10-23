package bookexp;

public class GradeBook {
	
	private String courseName;
	
//	// Builder initializing courseName with a String argument
//	public GradeBook(String name) {
//		
//		courseName = name;
//		
//	} // End of the builder
	
	// Method used to set the course name
	public void setCourseName(String name) {
		
		courseName = name;
		
	} // End of setCourseName
	
	// Method used to pick pickup the course name
	public String getCourseName() {

		return courseName;
		
	} // End of getCourseName
	
	// displayMessage getting courseName as input
	public void displayMessage() {

		// Function of displayMessage method
		System.out.printf("Welcome to the Grade Book for\n%s!\n", getCourseName());
		
	} // End of displayMessage method
	
} // End of class GradeBook
