package week4;
import java.util.Scanner;
import java.util.*;

public class lifecycle {

	public static void main(String[] args) {
		
		
		while(true) {
			int a, b;
			char num;
			Scanner sc = new Scanner(System.in);
			try {
				
				System.out.print("������ �Է��ϼ��� a: ");
				a = sc.nextInt();

				
				System.out.print("������ �Է��ϼ��� b: ");
				b = sc.nextInt();
				
				System.out.printf("%d + %d = %d\n", a, b, a+b);
				System.out.printf("%d - %d = %d\n", a, b, a-b);
				System.out.printf("%d * %d = %d\n", a, b, a*b);
				System.out.printf("%d / %d = %d\n", a, b, a/b);
				
			}
			catch(InputMismatchException e) {
				System.out.println("\n������ �ùٸ��� �Է��Ͽ� �ּ���.\n");
				continue;			
			}
			catch(ArithmeticException e) {
				System.out.println("\n0���� ���� �� �����ϴ�.\n");
				continue;			
			}
			finally {
				System.out.print("\nq�� �Է��ϸ� ���� �˴ϴ� : ");
				num = sc.next().charAt(0);
				if(num == (char)(113)) {
					break;
				}
				else {
					continue;
				}
			}
		}

	}

}
