import java.util.Scanner;

public class Student {

	// Here we create variables with PRIVATE access modifiers

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	 int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// This constructor will prompt user to enter student's name and year

	public Student() {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter student's first name: ");
		this.firstName = input.nextLine();

		System.out.print("Enter student's last name: ");
		this.lastName = input.nextLine();

		System.out.print(
				"\nEnter student's class level: \n1 - for Freshmen\n2- for Sophomore\n3- for Junior\n4 - for Senior");
		this.gradeYear = input.nextInt();

		setStudentID();

		// Here we call our enroll method to prompt selection of courses:

		//enroll();

	}

	// Generate an ID:
	// The id will be our static variable and will be incremented by 1 each time
	// this method is called. This is represented by id++;

	private void setStudentID() {

		// Grade Year + static ID.

		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses

	public void enroll() {

		// Get inside a loop, sentinel value will be user selecting 0

		do {
			System.out.print("\nEnter course to enroll (Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();

			if (!course.equals("Q")) {
				System.out.println();
				courses = courses + "\n " + course;
				tuitionBalance += costOfCourse;
			} else {
				System.out.println("");
				break;
			}

		} while (1 != 0);

		System.out.println("ENROLLED IN: " + courses);

	}

	// View balance

	public void viewBalance() {
		System.out.println("\nYour balance is: $" + tuitionBalance);

	}
	
	// Pay tuition

	public void payTuition() {
		viewBalance();
		Scanner pay = new Scanner(System.in);
		System.out.print("Please make a payment.");
		int tuitionPay = pay.nextInt();
		System.out.println("\nThank you for your payment of $" + tuitionPay + ".\nYour current tuition balance is: $" + (tuitionBalance - tuitionPay) + ".");
		
	}
	
	// Show status
	
	public String showStatus() {
		
		 return "\nName: " + firstName + " " + lastName + 
				 "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID + "\nCourse Enrolled: " 
				 + courses;
		
	}
		
		
	}
	
	

	




