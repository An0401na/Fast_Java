package ch14;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeTransTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Student> studentList = new ArrayList<Student>();  //student 객체의 수를 사용자가 지정하기때문에 배열이 아닌 arraylist 사용
		
		System.out.println("몇 명의 학생을 입력하시겠습니까? ");
		int studentCount = scanner.nextInt();
		for(int i=0; i<studentCount; i++) {
			System.out.println("학생의 이름과 가지고 있는 돈을 입력해주세요");
			System.out.printf("이름 : ");
			String name = scanner.next();
			System.out.printf("가지고 있는 돈 : ");
			int money = scanner.nextInt();
			
			studentList.add(new Student(name, money));	
		}
		System.out.println("\n========================================================");
		for(int i=0; i<studentCount; i++) {
			System.out.printf(i+1 +". "+ studentList.get(i).getName()+" \t");	
		}
		System.out.println("\n========================================================\n");
		Bus [] bus = new Bus[3]; // 만들 객체의 수가 지정 되어 있기 때문에 배열 사용.
		Subway [] subway = new Subway[3];
		
		for(int i=0, num=1; i<3; i++) {
			
			bus[i] = new Bus(100*num);
			subway[i] = new Subway(1*num);
			num++;
		}
		ArrayList<Taxi> taxiList = new ArrayList<Taxi>();
		int taxiCount=0; // 만들어진 택시 객체의 수
		int distance =0;
		
		int [] transNum = new int[studentCount];
		int i = 0;
			while(true) {
				if(i>=studentCount) {
					break;
				}
				System.out.println(studentList.get(i).getName()+"을 버스와 지하철, 택시 중 어느 것에 태우겠습니까?");

				System.out.println("1. 지하철 (1200원)  2. 버스 (1000원) 3. 택시 (100m 당 2800원)");
				transNum[i] = scanner.nextInt();
				if(transNum[i] == 1) {
					if(studentList.get(i).getMoney()>=1200) {
						System.out.println("탑승할 지하철은 1호선, 2호선, 3호선 중 몇 호선 입니까?");
						int subwayNum = scanner.nextInt();
						if(subwayNum !=1 && subwayNum !=2 && subwayNum !=3 ) {
							System.out.println("번호를 잘 못 입력하였습니다.");
						}else {
							System.out.println("<<"+studentList.get(i).getName()+"은 "+ subwayNum+ "호선 지하철을 탑승하였습니다.>>");
							studentList.get(i).setTransport("Subway");
							studentList.get(i).setTransNumber(subwayNum);
							studentList.get(i).takeSubway(subway[subwayNum-1]);
							System.out.println("");
							i++;
						}					
					}else if(studentList.get(i).getMoney()>=1000){
						System.out.println("지하철을 타기엔 학생의 남은 돈이 부족합니다. 다시 선택하시겠습니까? y/n ");
						char yOrN = scanner.next().charAt(0);
						if(yOrN == 'n') break;
					}else {
						System.out.println("<< 학생의 남은 돈이 부족하여 지하철을 탑승 할 수 없습니다. >>");
						i++;
					}
					
				}else if(transNum[i] ==2) {
					if(studentList.get(i).getMoney()>=1000) {
						System.out.println("탑승할 버스를 100번, 200번, 300번 중 몇 번 입니까?");
						int busNum = scanner.nextInt();
						if(busNum !=100 && busNum !=200 && busNum !=300) {
							System.out.println("번호를 잘 못 입력하였습니다.");
						}else {
							System.out.println("<< "+studentList.get(i).getName()+"은 "+ busNum+ "번 버스를 탑승하였습니다. >>");
							studentList.get(i).setTransport("Bus");
							studentList.get(i).setTransNumber(busNum);
							busNum = busNum/100-1;
							studentList.get(i).takeBus(bus[busNum]);
							System.out.println("");
							i++;
						}
					}else {
						System.out.println("<< 학생의 남은 돈이 부족하여 버스를 탑승 할 수 없습니다. >>");
						i++;
					}
				}else if(transNum[i]==3) {
					System.out.println("이용할 택시의 이름을 입력해주세요. ");
					String taxiName = scanner.next();
					System.out.println("이동할 거리는 몇 m입니까? ");
					distance = scanner.nextInt();
					
					int taxiFare = distance*28;
					if(studentList.get(i).getMoney()>=taxiFare) {
						System.out.println("<< "+studentList.get(i).getName()+"은 " + taxiName +"를 탑승하였습니다. >>");
						studentList.get(i).setTransport("Taxi");
						for(int j=0; j<=taxiList.size(); j++) {
							if(taxiList.size()!=0) {
								if(taxiName.equals(taxiList.get(j).getTaxiName())) {
									// 같은 이름인 택시 머니에 돈 넣기
									studentList.get(i).takeTaxi(taxiList.get(j),distance);
									break;
								}else {
									// 같은 이름인 택시가 없는경우 -> 택시 객체 생성
									taxiList.add(new Taxi(taxiName));	
									System.out.println("택시 생성");
									taxiCount++;
									studentList.get(i).takeTaxi(taxiList.get(taxiCount-1), distance);
									break;
								}
							}else {
								//택시 객체가 하나라도 있는 경우 -> 아묻따 택시 객체 생성
								taxiList.add(new Taxi(taxiName));	
								System.out.println("택시 생성1");
								taxiCount++;
								studentList.get(i).takeTaxi(taxiList.get(taxiCount-1), distance);
								break;
							}
						}
						System.out.println("");
						i++;
					}else if(studentList.get(i).getMoney()>=1000){
						System.out.println("택시를 타기엔 학생의 남은 돈이 부족합니다. 다시 선택하시겠습니까? y/n ");
						char yOrN = scanner.next().charAt(0);
						if(yOrN == 'n') break;
					}else {
						System.out.println("<< 학생의 남은 돈이 부족하여 택시를 탑승 할 수 없습니다. >>");
						i++;
					}
				}else {
					System.out.println("번호를 잘못 입력하셨습니다.");
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
