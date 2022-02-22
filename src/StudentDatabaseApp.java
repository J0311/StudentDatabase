//@author Joseph Walker

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

//Here we create n number of new students 
		
//	Student stu1 = new Student();
//	stu1.enroll();
//	stu1.payTuition();
//	System.out.println(stu1.showStatus());
	
// Ask how many students we want to add
	
	System.out.println("Enter number of new students to enroll: ");
	Scanner in = new Scanner(System.in);
	int numOfStudents = in.nextInt();
	Student [] students = new Student[numOfStudents];
	
// Create n number of students
	
	for (int n = 0; n < numOfStudents; n++) {
		students [n] = new Student();
		students[n].enroll();
		students[n].payTuition();
		System.out.println(students[n].showStatus());
		System.out.println();
	}
	
	}

}
