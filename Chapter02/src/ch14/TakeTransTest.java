package ch14;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeTransTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Student> studentList = new ArrayList<Student>();  //student ��ü�� ���� ����ڰ� �����ϱ⶧���� �迭�� �ƴ� arraylist ���
		
		System.out.println("�� ���� �л��� �Է��Ͻðڽ��ϱ�? ");
		int studentCount = scanner.nextInt();
		for(int i=0; i<studentCount; i++) {
			System.out.println("�л��� �̸��� ������ �ִ� ���� �Է����ּ���");
			System.out.printf("�̸� : ");
			String name = scanner.next();
			System.out.printf("������ �ִ� �� : ");
			int money = scanner.nextInt();
			
			studentList.add(new Student(name, money));	
		}
		System.out.println("\n========================================================");
		for(int i=0; i<studentCount; i++) {
			System.out.printf(i+1 +". "+ studentList.get(i).getName()+" \t");	
		}
		System.out.println("\n========================================================\n");
		Bus [] bus = new Bus[3]; // ���� ��ü�� ���� ���� �Ǿ� �ֱ� ������ �迭 ���.
		Subway [] subway = new Subway[3];
		
		for(int i=0, num=1; i<3; i++) {
			
			bus[i] = new Bus(100*num);
			subway[i] = new Subway(1*num);
			num++;
		}
		ArrayList<Taxi> taxiList = new ArrayList<Taxi>();
		int taxiCount=0; // ������� �ý� ��ü�� ��
		int distance =0;
		
		int [] transNum = new int[studentCount];
		int i = 0;
			while(true) {
				if(i>=studentCount) {
					break;
				}
				System.out.println(studentList.get(i).getName()+"�� ������ ����ö, �ý� �� ��� �Ϳ� �¿�ڽ��ϱ�?");

				System.out.println("1. ����ö (1200��)  2. ���� (1000��) 3. �ý� (100m �� 2800��)");
				transNum[i] = scanner.nextInt();
				if(transNum[i] == 1) {
					if(studentList.get(i).getMoney()>=1200) {
						System.out.println("ž���� ����ö�� 1ȣ��, 2ȣ��, 3ȣ�� �� �� ȣ�� �Դϱ�?");
						int subwayNum = scanner.nextInt();
						if(subwayNum !=1 && subwayNum !=2 && subwayNum !=3 ) {
							System.out.println("��ȣ�� �� �� �Է��Ͽ����ϴ�.");
						}else {
							System.out.println("<<"+studentList.get(i).getName()+"�� "+ subwayNum+ "ȣ�� ����ö�� ž���Ͽ����ϴ�.>>");
							studentList.get(i).setTransport("Subway");
							studentList.get(i).setTransNumber(subwayNum);
							studentList.get(i).takeSubway(subway[subwayNum-1]);
							System.out.println("");
							i++;
						}					
					}else if(studentList.get(i).getMoney()>=1000){
						System.out.println("����ö�� Ÿ�⿣ �л��� ���� ���� �����մϴ�. �ٽ� �����Ͻðڽ��ϱ�? y/n ");
						char yOrN = scanner.next().charAt(0);
						if(yOrN == 'n') break;
					}else {
						System.out.println("<< �л��� ���� ���� �����Ͽ� ����ö�� ž�� �� �� �����ϴ�. >>");
						i++;
					}
					
				}else if(transNum[i] ==2) {
					if(studentList.get(i).getMoney()>=1000) {
						System.out.println("ž���� ������ 100��, 200��, 300�� �� �� �� �Դϱ�?");
						int busNum = scanner.nextInt();
						if(busNum !=100 && busNum !=200 && busNum !=300) {
							System.out.println("��ȣ�� �� �� �Է��Ͽ����ϴ�.");
						}else {
							System.out.println("<< "+studentList.get(i).getName()+"�� "+ busNum+ "�� ������ ž���Ͽ����ϴ�. >>");
							studentList.get(i).setTransport("Bus");
							studentList.get(i).setTransNumber(busNum);
							busNum = busNum/100-1;
							studentList.get(i).takeBus(bus[busNum]);
							System.out.println("");
							i++;
						}
					}else {
						System.out.println("<< �л��� ���� ���� �����Ͽ� ������ ž�� �� �� �����ϴ�. >>");
						i++;
					}
				}else if(transNum[i]==3) {
					System.out.println("�̿��� �ý��� �̸��� �Է����ּ���. ");
					String taxiName = scanner.next();
					System.out.println("�̵��� �Ÿ��� �� m�Դϱ�? ");
					distance = scanner.nextInt();
					
					int taxiFare = distance*28;
					if(studentList.get(i).getMoney()>=taxiFare) {
						System.out.println("<< "+studentList.get(i).getName()+"�� " + taxiName +"�� ž���Ͽ����ϴ�. >>");
						studentList.get(i).setTransport("Taxi");
						for(int j=0; j<=taxiList.size(); j++) {
							if(taxiList.size()!=0) {
								if(taxiName.equals(taxiList.get(j).getTaxiName())) {
									// ���� �̸��� �ý� �ӴϿ� �� �ֱ�
									studentList.get(i).takeTaxi(taxiList.get(j),distance);
									break;
								}else {
									// ���� �̸��� �ýð� ���°�� -> �ý� ��ü ����
									taxiList.add(new Taxi(taxiName));	
									System.out.println("�ý� ����");
									taxiCount++;
									studentList.get(i).takeTaxi(taxiList.get(taxiCount-1), distance);
									break;
								}
							}else {
								//�ý� ��ü�� �ϳ��� �ִ� ��� -> �ƹ��� �ý� ��ü ����
								taxiList.add(new Taxi(taxiName));	
								System.out.println("�ý� ����1");
								taxiCount++;
								studentList.get(i).takeTaxi(taxiList.get(taxiCount-1), distance);
								break;
							}
						}
						System.out.println("");
						i++;
					}else if(studentList.get(i).getMoney()>=1000){
						System.out.println("�ýø� Ÿ�⿣ �л��� ���� ���� �����մϴ�. �ٽ� �����Ͻðڽ��ϱ�? y/n ");
						char yOrN = scanner.next().charAt(0);
						if(yOrN == 'n') break;
					}else {
						System.out.println("<< �л��� ���� ���� �����Ͽ� �ýø� ž�� �� �� �����ϴ�. >>");
						i++;
					}
				}else {
					System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				}
				
			}
			
		
		System.out.println("\n========================================================");
		for(i=0; i<studentCount; i++) {
			System.out.printf(i+1 +". ");
			studentList.get(i).showStudentInfo();
		}
		System.out.println("\n========================================================\n");
		for(i=0; i<subway.length; i++) {
			subway[i].showSubwayInfo();
		}
		System.out.println("\n========================================================\n");
		for( i=0; i<bus.length; i++) {
			bus[i].showBusInfo();
		}
		System.out.println("\n========================================================\n");
		for( i=0; i<taxiList.size(); i++) {
			taxiList.get(i).showTaxiInfo();
		}
		System.out.println("\n========================================================\n");
		
		
	}
}