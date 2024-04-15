package b;

import java.util.Scanner;

public class B6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		String strNum1 = sc.next();
		
		System.out.print("두번째 수: ");
		String strNum2 = sc.next();
		
		int num1 = Integer.parseInt(strNum1); // 
		int num2 = Integer.parseInt(strNum2); // strNum2는 원래 string이라 그대로 int로 옮길려하면 텍스트-> 숫자라서 오류가발생한다 그래서 인테거어쩌구 명령어필요
		
		int result = num1 + num2;
		System.out.println("결과 : " + result);
	}

}
