package applications;

import java.util.Locale;
import java.util.Scanner;

public class media_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int vetor[] = new int[n];
		
		for(int i = 0 ; i < vetor.length; i++ ) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		double media = 0;
		int soma = 0;
		int cont = 0;
		
		for(int i = 0 ; i < vetor.length; i++ ) {
			if(vetor[i] % 2 == 0 ) {
				soma = soma + vetor[i];
				cont ++;		
			}			
		}
		if(cont == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			media = soma / cont;
			System.out.printf("MEDIA DOS PARES = %.1f\n", media);
		}

		sc.close();
	}

}

