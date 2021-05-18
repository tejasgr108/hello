package hello;
public class arr {
	public static void main(String[] args) {
		int[][] a = new int[20][20];
		for (int i=0;i<4;i++) {
			for (int j =0;j<5;j++) {
				a[i][j]=i+j;
				System.out.println("\t"+a[i][j]);
			}
		}
		
		
		
	}

}
