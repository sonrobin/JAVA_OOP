package week3;

import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("���� 5�� �Է��ϼ���!!!");
		for (int i =0; i < 5; i++) {
			
			System.out.printf("%d ��° ���� : ", i+1);
			int num = sc.nextInt();
			if (num < 0)
			{
				continue;
			}
			sum += num;
			
		}
		System.out.println("�Է��� ���� �������� �� = " + sum);
		
		sc.close();
		
	}
	
}
