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
		System.out.println("주문 접수 번호 : "+orderNumber);
		System.out.println("주문 핸드폰 번호 : "+orderPhoneNumber);
		System.out.println("주문 집 주소 : "+address);
		System.out.println("주문 날짜 : "+date);
		System.out.println("주문 시간 : "+time);
		System.out.println("주문 가격 : "+price +"원");
		System.out.println("메뉴번호 : "+menuNumber);
		
	}

}
