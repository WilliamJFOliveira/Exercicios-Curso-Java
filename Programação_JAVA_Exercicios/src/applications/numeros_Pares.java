package applications;

import java.util.Locale;
import java.util.Scanner;

public class numeros_Pares {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		 int vetor [] = new int [n];
		 
		 for(int i = 0 ; i < vetor.length ; i++) {
			 System.out.print("Digite um numero: ");
			 vetor[i] = sc.nextInt();
		 }
		 int quant = 0;
		 System.out.println("NUMEROS PARES:");
		 for(int i = 0 ; i < vetor.length ; i++) {
			 if(vetor[i] % 2 == 0) {
				 System.out.print(vetor[i] + " ");
				 quant = quant +1;
			 }
		 }
		 System.out.println();
		 System.out.printf("QUANTIDADE DE PARES = %d", quant);
		
		
		sc.close();

	}

}
