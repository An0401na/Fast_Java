package ch14;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public Subway(int subwayNumger) {
		this.subwayNumber = subwayNumger;
	}

	public int getSubwayNumber() {
		return subwayNumber;
	}

	public void take(int money) {
		this.money +=money;
		passengerCount++;
		
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber+"ȣ�� ����ö�� �°��� "+passengerCount+"�̰�, ������ "+ money+"�� �Դϴ�.");
	}

}
