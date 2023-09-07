package applications;

import java.util.Scanner;

public class Exercicio_Fixaçao_marizes {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int z = sc.nextInt();
		
		int[][] mat = new int[n][z];

		for (int i=0; i<n; i++) {
			for (int j=0; j<z; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int pos = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<z; j++) {
				if(mat[i][j] == pos) {
					System.out.println("Position " +i+ "," +j+ ":");
					if(j > 0) {
						System.out.printf("Left: %d\n",mat[i][j-1]);
					}if(i > 0 ) {
						System.out.printf("Up: %d\n",mat[i-1][j]);
					}if(j < mat[i].length-1) {
						System.out.printf("Right: %d\n",mat[i][j+1]);
					}if(i < mat.length) {
						System.out.printf("Down: %d\n",mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
