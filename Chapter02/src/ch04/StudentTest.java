package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID=12345;
		studentLee.setStudentName("�̼���");
		studentLee.address="����";
		
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID =12346;
		studentKim.setStudentName("������");
		studentKim.address="����";
		
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
		
	}

}