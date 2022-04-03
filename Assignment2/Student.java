package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Student name is Kani");
	
	}
	public void studentDept() {
		
		System.out.println("Student department is ECE");
		
	}
    public void studentId() {
    	
    	System.out.println("Student department is 438");
    	
    }
	public static void main(String[] args) {
	    
		Student gradute = new Student();
		
		gradute.collegeName();
		gradute.collegeCode();
		gradute.collegeRank();
		gradute.deptName();
		gradute.studentName();
		gradute.studentDept();
		gradute.studentId();
		

	}

}
