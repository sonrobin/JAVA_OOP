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
				
				System.out.print("정수를 입력하세요 a: ");
				a = sc.nextInt();

				
				System.out.print("정수를 입력하세요 b: ");
				b = sc.nextInt();
				
				System.out.printf("%d + %d = %d\n", a, b, a+b);
				System.out.printf("%d - %d = %d\n", a, b, a-b);
				System.out.printf("%d * %d = %d\n", a, b, a*b);
				System.out.printf("%d / %d = %d\n", a, b, a/b);
				
			}
			catch(InputMismatchException e) {
				System.out.println("\n정수를 올바르게 입력하여 주세요.\n");
				continue;			
			}
			catch(ArithmeticException e) {
				System.out.println("\n0으로 나눌 수 없습니다.\n");
				continue;			
			}
			finally {
				System.out.print("\nq를 입력하면 종료 됩니다 : ");
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
