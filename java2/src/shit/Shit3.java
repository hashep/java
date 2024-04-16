package shit;

import java.util.Scanner;

public class Shit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int a = 0;
		int sum = 0;
		int count = 0;
		
		while(count < 5) {
			a = sc.nextInt();
			count += 1;
			if (a>0) {
				sum += a;
			}
		};
		
		System.out.println("양수의 합은 " + sum);
	}

}
