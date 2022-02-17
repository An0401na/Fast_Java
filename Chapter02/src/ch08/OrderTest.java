package ch08;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("주문하시겠습니까?  y,n ");
		char yOrN = scanner.next().charAt(0);
	
		if(yOrN =='y') {
			LocalDate dateNow = LocalDate.now(); // 현재 날짜
			
			DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("yyyyMMdd");
			String date = dateNow.format(dateFormatter); // 주문 날짜
			
			LocalTime timeNow = LocalTime.now(); //현재 시간 
			DateTimeFormatter timeFormatter= DateTimeFormatter.ofPattern("HHmmss");
			String time = timeNow.format(timeFormatter); // 주문 시간
			
			String orderPhoneNumber;
			String address;
			int price=0;
			String menuNumber;
			
			System.out.print("주문하실 메뉴 번호를 입력하세요 -> ");
			menuNumber = scanner.next();
			if(menuNumber.equals("0003")) {
				price = 35000;
			}
			
			System.out.print("주문자의 핸드폰 번호를 입력하세요 -> ");
			orderPhoneNumber = scanner.next();
			
			scanner.nextLine(); // 개행문자 삭제

			System.out.print("주문자의 집 주소를 입력하세요 -> ");
			address=scanner.nextLine();
			
			Order order1 = new Order(date,orderPhoneNumber, address,time,price,menuNumber);
			System.out.println("--------------------------");
			System.out.println("주문이 완료 되었습니다.");
			order1.showOrderInfo();
			System.out.println("--------------------------");
		}
	}

}
