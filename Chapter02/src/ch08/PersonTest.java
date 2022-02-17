package ch08;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		
		Person Tomas = new Person(180, 78,"남성", "Tomas", 37 );
		
		Tomas.showPersonInfo();
		
		int weight;
		int height;
		String sex;
		String name;
		int age;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print(" 키  : " );
		height = scanner.nextInt();
		System.out.print(" 몸무게  : " );
		weight = scanner.nextInt();
		System.out.print(" 성별  : " );
		sex = scanner.next();
		System.out.print(" 이름  : " );
		name = scanner.next();
		System.out.print(" 나이  : " );
		age = scanner.nextInt();
		
		Person APerson = new Person(height, weight, sex,name,age);
		
		APerson.showPersonInfo();
		
		
		
		
		
	}

}
