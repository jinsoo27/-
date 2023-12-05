package java_ex100;

public class ex100_80 {

	public static void main(String[] args) {
		
		String password = "qhyhu wuxvw euxwxv";
		for(int i=0; i<password.length(); i++) {
			char c = password.charAt(i);
			
			if(c >= 'd' && c <= 'z' ) {
				System.out.print( (char)(c - 3) );
			}
			else if(c >= 'a' && c <= 'c') {
				System.out.println( (char)(c + 23) );
			}
			else { 
				System.out.print(c);
			}
		}
	}

}
