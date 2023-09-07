package applications;

import java.util.Locale;
import java.util.Scanner;

public class soma_Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i =0 ;i < vetor.length; i ++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.println();
		double soma = 0;
		
		System.out.print("VALORES = ");
		for(int i =0 ;i < vetor.length; i ++) {
			System.out.print(vetor[i]+ " ");
			soma = soma + vetor[i];
		}
		System.out.println();
		
		double media = soma / n;
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();

	}

}
