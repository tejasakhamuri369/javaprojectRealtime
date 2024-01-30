package StudentApplication;

import java.util.Scanner;

public class StudentDetails {
	private int gradeyear;
	private String Firstname;
	private String Lastname;
	private String Studentid;
	private String Courses;
	private int tutorialBalance =0;
	private int costofCourse =600;
	private static int id = 1001;
	Scanner sc = new Scanner(System.in);

	public StudentDetails() {
		super();
				System.out.println("Enter the firstname of the student");
		this.Firstname =sc.next();
		System.out.println("Enter the lastname of the student");
		this.Lastname =sc.next();
		System.out.print("Enter the grade year:\n1.Freshman\n2.Sophmore\n3.junior\n4.Senior");
		this.gradeyear =sc.nextInt();
		getStudentid();
		System.out.println(Firstname+Lastname+""+":"+Studentid);
		String t =enrollSubjects();
		System.out.print(t);
	}
	private String getStudentid()
	{
		id++;
		return Studentid =gradeyear +""+ id ;
		
	}
	
	public String enrollSubjects() {
        System.out.println("Enter the courses or type Q to Quit ");
        String course;
		while (true) {
			course= sc.next();
            if (course.equalsIgnoreCase("Q")) {
                break; // Quit the loop if 'Q' is entered
            } else {
                tutorialBalance += 600; // Increment balance for each course
            }
        }
        System.out.println("courses: " +course );
		return course;
    }
	public void viewtutorialBalance() {
		System.out.println("Total Tutorial Balance: " + tutorialBalance);
	}
	public void payment()
	{
		System.out.println("Enter the Amount want to paid");
		int payment = sc.nextInt();
		tutorialBalance = tutorialBalance - payment;
		viewtutorialBalance();
		
	}
	
}
