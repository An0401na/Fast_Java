package ch14;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber= busNumber;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"번 버스의 승객은 "+passengerCount+"이고, 수입은 "+ money+"원 입니다.");
	}

}
