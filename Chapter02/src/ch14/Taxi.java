package ch14;

public class Taxi {
	private	String taxiName;
	private int money;
	private int distance;
	
	public Taxi (String taxiName ) {
		this.taxiName= taxiName;
	}
	
	public String getTaxiName() {
		return taxiName;
	}
	public void take(int money, int distance) {
		this.money+=money;
		this.distance+=distance;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiName+"회사 택시의 주행거리는 " + distance+"m 이고, 수입은 "+ money+"원 입니다.");
	}
	
	
	
}
