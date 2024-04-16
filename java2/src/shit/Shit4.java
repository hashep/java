package shit;

import java.util.Scanner;

public class Shit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input; // null 없으면 안됨
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) { // 자바 string 비교할때 != == 이지랄하면 죽는다
			input = sc.nextLine();
			if(input.equals("exit")) {
				break;
			}
		}
		
		System.out.println("종료합니다...");
	}

}
