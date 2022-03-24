package week4;

public class ArrayCall {
	
	public static int sum(int def[], int n) {
		def[++n] = 100;
		int sum = 0;
		for (int i = 0; i < def.length; i++) {
			sum  += def[i];
		}
		
		return sum;
	}	//call by value, call by reference
	
	public static void main(String[] args) {
		
		int[] abc = {99,89,96,87,99};
		int k = 3;
		int hap = sum(abc,k);
		
		for (int i : abc) {
			System.out.println(i);
		}
		
		System.out.println(hap);

	}

}
