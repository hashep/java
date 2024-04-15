package b;

import java.util.Scanner;

public class B7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String Name = sc.nextLine();

        System.out.print("주민번호 앞 6자리: ");
        int Num = sc.nextInt();
        sc.nextLine(); // tyde <3

        System.out.print("전화번호: ");
        String Phone = sc.nextLine();

        System.out.println("\n[입력된 내용]");
        System.out.println("이름: " + Name);
        System.out.printf("주민번호 앞 6자리: %s \n", Num);
        System.out.printf("전화번호: %d", Phone);
    }

}