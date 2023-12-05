package java_ex100;
import java.util.Scanner;

public class ex100_81 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i=0; i<5; i++) {
			nums[i] = scan.nextInt();
		}
		
		
		int max = 0; 
		for(int i=0; i<5; i++) {
			if(max < nums[i] )
				max = nums[i];
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<5; i++) {
			if(min > nums[i])
				min = nums[i];
		}
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
	}

}
