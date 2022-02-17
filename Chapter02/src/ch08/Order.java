package ch08;

public class Order {
	
	private String orderNumber; // date+menuNumber
	private String orderPhoneNumber;
	private String address;
	private String date;
	private String time;
	private int price;
	private String menuNumber;
	
	public Order(String date,String orderPhoneNumber, String address, String time,int price, String menuNumber) {
		this.orderNumber = date + menuNumber;
		this.orderPhoneNumber = orderPhoneNumber;
		this.address=address;
		this.date=date;
		this.time=time;
		this.price=price;
		this.menuNumber = menuNumber;
	}
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ : "+orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : "+orderPhoneNumber);
		System.out.println("�ֹ� �� �ּ� : "+address);
		System.out.println("�ֹ� ��¥ : "+date);
		System.out.println("�ֹ� �ð� : "+time);
		System.out.println("�ֹ� ���� : "+price +"��");
		System.out.println("�޴���ȣ : "+menuNumber);
		
	}

}
