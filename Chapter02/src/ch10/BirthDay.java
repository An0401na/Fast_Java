package ch10;

public class BirthDay {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid; // ����Ʈ �� f
	
	
	
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}


	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
			
		}else {
			isValid = true;
			this.month = month;
		}
	}

	
	public void setYear(int year) {
	
		this.year = year;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
	public void showDate() {
		if(isValid) {
			System.out.println(year+"��"+month+"��" + day+"�� �Դϴ�.");
		}else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	} 
	
}