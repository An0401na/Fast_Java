package ch08;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Person Tomas = new Person(180, 78,"����", "Tomas", 37 );
		
		Tomas.showPersonInfo();
		
		int weight;
		int height;
		String sex;
		String name;
		int age;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print(" Ű  : " );
		height = scanner.nextInt();
		System.out.print(" ������  : " );
		weight = scanner.nextInt();
		System.out.print(" ����  : " );
		sex = scanner.next();
		System.out.print(" �̸�  : " );
		name = scanner.next();
		System.out.print(" ����  : " );
		age = scanner.nextInt();
		
		Person APerson = new Person(height, weight, sex,name,age);
		
		APerson.showPersonInfo();
		
		
		
		
		
	}

}
