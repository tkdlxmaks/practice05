package prob1;
import java.util.Scanner;


public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		
		/*  구현합니다. */
		/*String 메소드를 사용 - subString도 있고,  
		 * char[] a = s.toCharArray();
		 * 새로 char 배열을 만들어서 값을 할당
		 * 속도면에서 배열이 더 빨라. 
		 * */
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
