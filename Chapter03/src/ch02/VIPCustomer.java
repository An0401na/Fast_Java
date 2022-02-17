package ch02;

public class VIPCustomer extends Customer {
	
	private String agentId;
	double saleRatio;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		saleRatio= 0.1;
		customerGrade="VIP";
	}
	
	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= price * saleRatio;
		return price;
	}
	
	public String getAgentId() {
		return agentId;
	}
}
