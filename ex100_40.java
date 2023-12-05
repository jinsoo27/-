package java_ex100;

import java.util.Scanner;

public class ex100_40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("½½±â°¡ ´øÁø °øÀÇ À§Ä¡>");
		float ball = scan.nextFloat();
		
		if(ball<=60 && ball>=50) {
			System.out.println("Win");
		}else {
			System.out.println("Lose");
			
		}

	}

}