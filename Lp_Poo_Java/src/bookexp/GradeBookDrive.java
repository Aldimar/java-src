package bookexp;
import java.util.Scanner;

public class GradeBookDrive {

	public static void main(String[] args) {
				
//		// Object creation with values already set
//		GradeBook gradeBook1 = new GradeBook("Java basic");
//		GradeBook gradeBook2 = new GradeBook("Java expert");
//		
//		// Show the initial value of the variables gradeBook1 / gradeBook2
//		System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName());
//		System.out.printf("gradeBook2 course name is: %s\n", gradeBook2.getCourseName());
		
		// Scanner object creation
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Object creation
		GradeBook myGradeBook = new GradeBook();
		
		// Display the initial name of the course: Null
		System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());
		
		// Prompt for user input
		System.out.println("Enter the course name: ");
		String nameCourse = input.nextLine();
		myGradeBook.setCourseName(nameCourse);
		System.out.println();
		
		// Method displayMessage() being called
		myGradeBook.displayMessage();
		
	} // End of main method

} // End of class GradeBookDrive
