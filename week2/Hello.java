package week2;

public class Hello {
	
	public static int sum(int n, int m) {
		
		return n+m;
		
	}

	public static void main(String[] args) {
		
		int i = 20, j = 024, k = 0x14, l = 0b10100;
		int s;
		char a;
		byte b;
		
		s = sum(i, 10);
		a = '?';
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println("i = " + i + "\nj = " + j + "\nk = " + k + "\nl = " + l);

	}

}
