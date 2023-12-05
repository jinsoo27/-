package java_ex100;
import java.util.Scanner;

public class ex100_88 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("n값은:");
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				sum = sum + j;
			}
		}
		System.out.println("수열의합:"+sum);
		
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=n; i++) {
			sum1 = sum1 + i;
			sum2 = sum2 + sum1;
		}
		System.out.println("수열의합:"+sum2);
	}

}
