package ch08;

public class Person {
	
	private int height;
	private int weight;
	private String sex;
	private String name;
	private int age;
	
	
	public Person(int height, int weight, String sex, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.sex=sex;
		this.name =name;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println("Ű�� "+height+" �̰� �����԰� "+weight + "ų���� "+sex+"�� �ֽ��ϴ�. �̸��� "+name+" �̰� ���̴� "+age+"�� �Դϴ�.");
	}
	
	
}
