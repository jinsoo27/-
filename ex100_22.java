package java_ex100;

import java.util.Scanner;

public class ex100_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("정수를 입력하세요>");
		int a = scan.nextInt();
		System.out.println("정수를 입력하세요>");
		int b = scan.nextInt();
		if(b<a) {
			System.out.println("1");
		}else if( b >= a) { 
			System.out.println("0");
			
		}
		
		if(b<a) {
			System.out.println("1");
		}else if( b==a || b>a) { 
			System.out.println("0");
			
		}
		scan.close();
		
	}
}
