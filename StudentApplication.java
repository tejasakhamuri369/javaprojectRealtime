package StudentApplication;

import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("how many Students will be added to the database");
		int students = sc.nextInt();
		StudentDetails[] arr =new StudentDetails[students];
		
		for(int i=0;i<students;i++) {
			arr[i] = new StudentDetails();
		arr[i].enrollSubjects();
		arr[i].payment();
		
		
	}

	}
}
