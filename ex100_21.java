package java_ex100;

import java.util.Scanner;

public class ex100_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(0<=a) {
			int b = scan.nextInt();
			if(b<=10) {
				double multi = a*Math.pow(2, b);
				System.out.println(multi);
			}else {
				System.out.println("다시 입력해 주세요.");
			}
		}else {
			System.out.println("다시 입력해 주세요.");
		}
	}


}