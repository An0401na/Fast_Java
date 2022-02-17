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
		System.out.println(subwayNumber+"호선 지하철의 승객은 "+passengerCount+"이고, 수입은 "+ money+"원 입니다.");
	}

}
