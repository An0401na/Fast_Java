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
		System.out.println("키가 "+height+" 이고 몸무게가 "+weight + "킬로인 "+sex+"이 있습니다. 이름은 "+name+" 이고 나이는 "+age+"세 입니다.");
	}
	
	
}
