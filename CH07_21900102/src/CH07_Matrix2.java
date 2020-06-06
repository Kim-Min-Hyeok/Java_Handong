
public class CH07_Matrix2 {
	public static void makeMatrix2(int[][] a) {
		int i=1;
		for(int r=0; r<a.length; r++) {
			for(int c=0; c<a[r].length; c++, i++) {
				a[r][c] = i;
			}
		}
	}
	public static void addition(int[][] a, int[][] b) {
		System.out.println("\nMatrix addition is ..");
		for(int r=0; r<a.length; r++) {
			for(int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + b[r][c] + " ");
			}
			System.out.println("");
		}
	}
	public static void subtraction(int[][] a, int[][] b) {
		System.out.println("\nMatrix subtraction is ..");
		for(int r=0; r<a.length; r++) {
			for(int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] - b[r][c] + " ");
			}
			System.out.println("");
		}
	}
	public static void multiplication(int[][] a, int[][] b) {
		System.out.println("\nMatrix multiplication is ..");
		   int[][] mul = new int[a.length][b[0].length];
	         
	        for(int i=0; i<mul.length;i++){
	            for(int j=0; j<mul[0].length;j++){
	                 
	                for(int k=0; k<a[0].length;k++){
	                    mul[i][j] += a[i][k]*b[k][j];
	                }
	                 
	            }
	             
	        }
	       for (int i = 0; i < mul.length; i++) {
	              for (int j = 0; j < mul[i].length; j++) {
	                  System.out.print(mul[i][j] + " ");
	              }
	              System.out.println();
	          }
	         
	    }
	 
}
