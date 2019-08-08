package managementsystem;

import java.util.*;
public class Login
{
	public static void main(String args[]){
		
		Scanner getvalue=new Scanner(System.in);
		System.out.println("1.student,2.teacher");
		int val = getvalue.nextInt();
		Teacher tcr=new Teacher();
		Student stu=new Student();
		switch (val)
		{
		case 1:
			System.out.println("1.student");
			stu.addstudent();
			break;
			
		case 2:
			System.out.println("2.teacher");
			tcr.addteacher();
			break;
		
		default:
			System.out.println("invalid details");
			
		}
	}
	}
	

