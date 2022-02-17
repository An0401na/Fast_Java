package ch10;

public class SwitchExpression {

	public static void main(String[] args) {
		
		int month = 112;
		
		int day = switch(month) {
			case 1,3,5,7,8 ->
				31;
			case 4,6,9,11 -> {
				System.out.println("�Ѵ��� 30��");
				yield 30;
			}
			case 2 -> {
				System.out.println("28��");
				yield 28;
			}
			default ->{
				System.out.println("�������� ����");
				yield 0;
			}
		};
		
		System.out.println(month +"�� "+ day);
		
	}
}
