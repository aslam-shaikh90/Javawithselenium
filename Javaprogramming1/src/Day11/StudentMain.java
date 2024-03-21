package Day11;

public class StudentMain {

	public static void main(String[] args) {
		
		// Objects
		
		Student stu=new Student();
		
		// Approach 1: For calling Object by using object reference variables
		
		stu.sid=101;
		stu.sname="aslam";
		stu.grad='A';
		
		stu.printStudentData();
	}

}
