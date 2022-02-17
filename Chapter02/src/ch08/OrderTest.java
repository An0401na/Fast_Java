package ch08;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("�ֹ��Ͻðڽ��ϱ�?  y,n ");
		char yOrN = scanner.next().charAt(0);
	
		if(yOrN =='y') {
			LocalDate dateNow = LocalDate.now(); // ���� ��¥
			
			DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("yyyyMMdd");
			String date = dateNow.format(dateFormatter); // �ֹ� ��¥
			
			LocalTime timeNow = LocalTime.now(); //���� �ð� 
			DateTimeFormatter timeFormatter= DateTimeFormatter.ofPattern("HHmmss");
			String time = timeNow.format(timeFormatter); // �ֹ� �ð�
			
			String orderPhoneNumber;
			String address;
			int price=0;
			String menuNumber;
			
			System.out.print("�ֹ��Ͻ� �޴� ��ȣ�� �Է��ϼ��� -> ");
			menuNumber = scanner.next();
			if(menuNumber.equals("0003")) {
				price = 35000;
			}
			
			System.out.print("�ֹ����� �ڵ��� ��ȣ�� �Է��ϼ��� -> ");
			orderPhoneNumber = scanner.next();
			
			scanner.nextLine(); // ���๮�� ����

			System.out.print("�ֹ����� �� �ּҸ� �Է��ϼ��� -> ");
			address=scanner.nextLine();
			
			Order order1 = new Order(date,orderPhoneNumber, address,time,price,menuNumber);
			System.out.println("--------------------------");
			System.out.println("�ֹ��� �Ϸ� �Ǿ����ϴ�.");
			order1.showOrderInfo();
			System.out.println("--------------------------");
		}
	}

}
