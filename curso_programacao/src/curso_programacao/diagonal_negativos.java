package curso_programacao;
import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N, cont;
		System.out.print("Qual a ordem da matriz?");
		N = sc.nextInt();
		
		int [][] vet = new int[N][N];
		
		for(int i = 0; i < N ; i ++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento ["+ i +  "," + j + "]:");
				vet[i][j] = sc.nextInt();
			}
		}
		System.out.println("DIAGONAL PRINCIPAL:");
		for(int i = 0; i < N; i++) {
			System.out.print(vet[i][i] + " ");
		}
		System.out.println();
		
		cont = 0;
		
		for(int i = 0; i < N ; i ++) {
			for(int j = 0; j < N; j++) {
				if(vet[i][j] < 0) {
					cont = cont + 1;
			 }
		 }
	 }
		System.out.print("QUANTIDADE DE NEGATIVOS ="+ cont);
		sc.close();
 }
}
