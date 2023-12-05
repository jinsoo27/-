package java_ex100;
import java.util.Scanner;

public class ex100_78 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		char op;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요.");
		num1 = scan.nextInt();
	
		int result = num1;
	
		while(true)
		{
			String input = scan.next();
			op = input.charAt(0);
			if(op == '=') {
				System.out.println(result);
				break;
			}
			
			num2 = scan.nextInt();
			
			if(op == '+') {
				result = result + num2;
			}else if(op == '-') {
				result = result - num2;
			}else if(op == '*') {
				result = result * num2;
			}else if(op == '/') {
				result = result / num2;
			}
		}
	}

}
