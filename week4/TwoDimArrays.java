package week4;

public class TwoDimArrays {
	
	public static void testArr(double[][] abc) 
	{
		System.out.println("����");
	}
	
	public static void main(String[] args) 
	{
		//int[] arr1 = new int[5];
		double score[][] = {{4.5, 4.0}, {3.5, 4.3}, {2.0, 4.5}};
		double sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				sum += score[i][j];
			}
			
		}
		int n = score.length;
		int m = score[0].length;
		double avg = sum/(n*m);
		
		System.out.printf("���� %.2f �̰� ������ %.2f �Դϴ�.\n", sum, avg);
		testArr(score);
	}
}
