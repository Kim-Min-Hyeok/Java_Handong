
public class CH07_Matrix {
	
	public static void makeMatrix(int[][] a){
		for(int r=0; r<a.length; r++) {
			int i=r;
			for(int c=0; c<a[r].length; c++) {
				a[r][c] = c+i;
			}
		}
	}
	public static void printMatrix(int[][] a) {
		for(int r=0; r<a.length; r++) {
			for(int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c]+ " ");
			}
			System.out.println("");
		}
	}	
}
