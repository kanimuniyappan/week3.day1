package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("student ID is : " +id);
	}
   
    public void getStudentInfo(String name) {
		
		System.out.println("student name is : " +name);
	}
  
    public void getStudentInfo(String email, long phoneNmuber ) {
		
		System.out.println("student email is : " +email);
		System.out.println("student phonenumber is : " +phoneNmuber);
	}
	public static void main(String[] args) {
		
		Students details = new Students();
		
		details.getStudentInfo(234);
		details.getStudentInfo("kani");
		details.getStudentInfo("kani92@gmail.com", 9176656319L);
		

	}

}
