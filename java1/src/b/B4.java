package b;

import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a;
		
		while(true) {
			a = scanner.nextLine();
			System.out.println("입력된문자열: \"" + a + "\"");
			if(a.equals("saygex")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
