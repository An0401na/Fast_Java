package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("ÀÌÃ¢¼ö");
		customerLee.setCustomerID(1001);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setCustomerGrade("VIP");
		customerKim.setCustomerID(1002);
		customerKim.setCustomerName("±èÃ¶¼ö");
		customerKim.bonusPoint=5000;
		
		System.out.println(customerKim.showCustomerInfo());
	}

}
