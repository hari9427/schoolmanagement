package managementsystem;

import java.util.Scanner;

public class Teacher {
	private String name;
	private int age;
	private int attendance;
	public Teacher() {}
	public void addteacher() {
		Scanner getvalue =new Scanner(System.in);
		Teacher s= new Teacher();	
		System.out.println("enter the Teacher name");
		s.setName(getvalue.next());
		System.out.println("enter Teacher age:");
		s.setAge(getvalue.nextInt());
		System.out.println("enter the attendance");
		s.setAttendance(getvalue.nextInt());
		System.out.println("details:::"+s.getName()+"\t"+s.getAge()+"\t"+s.getAttendance());
		
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance= attendance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
		
	@override
	public Teacher(String name,int age,int attendance) {
			super();
			this.name=name;
			this.age=age;
			this.attendance=attendance;
		}
	
		
}

		
		
		
	


