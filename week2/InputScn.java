package week2;

import java.util.Scanner;

public class InputScn {

	public static void main(String[] args) {
		
		int a;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		a = sc.nextInt();
		System.out.println(a);
		
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.println(name);
		
		sc.close();
		
	}

}
