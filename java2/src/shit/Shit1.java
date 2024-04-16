package shit;

import java.util.Scanner;

public class Shit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 0; // 입력
		int b = 0; // 순서
		int c = 0; // 합 

		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		while(a != -1) {
			a = sc.nextInt();
			if (a != -1) {
				b += 1;
				c += a;
			} else {
				break;
			}
		}
		
		System.out.printf("\n 정수의 개수는 %1$d개이며 평균은 %2$d입니다.", b, c/b);
	}

}
