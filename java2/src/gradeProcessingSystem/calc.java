package gradeProcessingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		int input;
		String name;
		int grade;
		
		System.out.println("Welcome to system. Choice NO in below.\n0. quit.\n1. Input\n");
		
		while(true) {
			System.out.println("Your choice?");
			input = sc.nextInt();
			
			if(input == 1) {
				
			} else {
				break;
			}
			
			System.out.println("Name?");
			name = sc.next();
			
			System.out.println("grade?");
			grade = sc.nextInt();
			
			list.add(grade, name);
			System.out.println(list);
		}
	}

}
