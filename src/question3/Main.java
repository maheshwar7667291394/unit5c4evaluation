package question3;

import java.sql.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter roll");
		int roll=input.nextInt();
		
		System.out.println("Enter name");
		String name=input.next();
		
		System.out.println("Enter standard");
		String standard=input.next();
		
		System.out.println("enter date of birth in yyyy-dd-mm");
	    String date=input.next();
	     
	     System.out.println("Enter fee");
	     int fee=input.nextInt();
	     
	     Studentdao student=new StudentDaoimpl();
	     String result;
		try {
			result = student.insertstudent(roll, name, standard, date, fee);
			 System.out.println(result);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}

}
