package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		int num = 10;
		int bNum=0b1010;
		int oNum = 012;
		int xNum = 0xA;
	
		char ch = 66;
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((char)ch);
		
		char han='วั';
		
		System.out.println((int)han);
		
		char a =54620;
		System.out.println(a);
		char ab ='\uD55C';
		System.out.println(ab);
		
		var chh ='a';
		System.out.println(chh);
		System.out.println((int)chh);
		
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
