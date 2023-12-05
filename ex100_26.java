package java_ex100;

import java.util.Scanner;

public class ex100_26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean b = scan.nextBoolean();
		
		if(b==true) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
		System.out.println(!b);
	}
}
