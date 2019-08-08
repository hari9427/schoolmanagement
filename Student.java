package managementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	static Scanner getvalue = new Scanner(System.in);
	static ArrayList<String> listOfStudent = new ArrayList<>();

		
		static void addstudent()
		{
		Teacher s= new Teacher();	
		System.out.println("enter the student name");
		s.setName(getvalue.next());
		System.out.println("enter student age:");
		s.setAge(getvalue.nextInt());
		System.out.println("enter the attendance");
		s.setAttendance(getvalue.nextInt());
		System.out.println("details"+s.getName()+"\t"+s.getAge()+"\t"+s.getAttendance());
		}
}	
		
