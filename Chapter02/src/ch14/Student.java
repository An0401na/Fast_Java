package ch14;

public class Student {
	private String name;
	private int money;
	private String transport =".";
	private int transNumber;
	
	
	public int getTransNumber() {
		return transNumber;
	}

	public void setTransNumber(int transNumber) {
		this.transNumber = transNumber;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	Student(String name, int money) {
		this.name = name;
		this.money= money;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}
	
	public String getTransport() {
		return transport;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		money -=1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		money -=1200;
	}
	
	public void takeTaxi(Taxi taxi, int distance) {
		taxi.take(distance*28, distance);
		money -=distance*28;
	}
	
	public void showStudentInfo() {
		if(transport.equals("Subway"))
			System.out.println(name +" 학생이 "+transport+" "+transNumber+"호선을 타고 남은 돈은 " + money+"원입니다.");
		else if(transport.equals("Bus"))
			System.out.println(name +" 학생이 "+transport+" "+transNumber+"번을 타고 남은 돈은 " + money+"원입니다.");
		else if(transport.equals("Taxi"))
			System.out.println(name +" 학생이 "+transport+"를 타고 남은 돈은 " + money +"원입니다.");
		else
			System.out.println(name+" 학생은 돈이 부족하여 이동하지 못하였습니다.");
	}

}
