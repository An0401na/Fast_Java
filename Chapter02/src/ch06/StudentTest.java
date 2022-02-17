package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(201811423,"ȫ�浿", 2);
		
		Student studentKim = new Student();
		
		
		
		System.out.println(studentLee.showStudentInfo());
		System.out.println(studentKim.showStudentInfo());
		
	}

}
