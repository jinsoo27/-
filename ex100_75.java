package java_ex100;
import java.util.Scanner;
public class ex100_75 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0; 
		for(int i=1; i<=n; i++) {
			if(n % i == 0) { 
				count++;
			}
		}
		if(count == 2) {
			System.out.println("소수임");
			System.out.println("약수갯수:"+count);
		}else {
			System.out.println("소수가 아님");
			System.out.println("약수갯수:"+count);
		}
	}

}
