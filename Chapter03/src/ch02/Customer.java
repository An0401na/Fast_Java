package ch02;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio; //���ʽ� ���� ���� �Ϲ� ���� 1% ���ʽ� ����
	
//	public Customer() {
//		bonusRatio = 0.01;
//		customerGrade = "SILVER";
//		 
//	}
	
	public Customer (int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		bonusRatio = 0.01;
		customerGrade = "SILVER";
		
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int calcPrice(int price) {
		bonusPoint += price *bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"���� ����� " + customerGrade+"�̸�, ���ʽ� ����Ʈ�� " +bonusPoint+"�Դϴ�.";
	}

}
