package gradeProcessingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> namelist = new ArrayList<>();
		ArrayList<Integer> gradelist = new ArrayList<>();
		ArrayList<String> gradegradelist = new ArrayList<>();
		ArrayList<Integer> ranklist = new ArrayList<>();
		
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
			namelist.add(name);
			
			System.out.println("grade?");
			grade = sc.nextInt();
			gradelist.add(grade);
		}
		
		for(int i=0;i<gradelist.size();i++) {
			if(90 <= gradelist.get(i) && gradelist.get(i) <= 100) {
				gradegradelist.add("A");
			}else if(80 <= gradelist.get(i) && gradelist.get(i) < 90) {
				gradegradelist.add("B");
			} else {
				gradegradelist.add("C");
			}
		}
		
		for(int i=0;i<gradelist.size();i++) {
			for(int j=0;j<gradelist.size();j++) {
				if(gradelist.get(j) < gradelist.get(i)) {
					int tempI = gradelist.get(i);
					int tempJ = gradelist.get(j);
					gradelist.set(i, tempJ);
					gradelist.set(j, tempI);
					
					String TempI = namelist.get(i);
					String TempJ = namelist.get(j);
					namelist.set(i, TempJ);
					namelist.set(j, TempI);
					
					String gradeI = gradegradelist.get(i);
					String gradeJ = gradegradelist.get(j);
					gradegradelist.set(i, gradeJ);
					gradegradelist.set(j, gradeI);
				}
			}
		}
		
		System.out.println();
		System.out.printf("The first grade is %s and %s \n", namelist.get(0), gradegradelist.get(0));
		System.out.printf("The second grade is %s and %s \n", namelist.get(1), gradegradelist.get(1));
	}
}
