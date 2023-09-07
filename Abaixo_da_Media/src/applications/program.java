package applications;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double vetor[] = new double[n];
		
		double media = 0;
		double somaVetores = 0;
		for(int i = 0 ; i < vetor.length; i ++) {
			System.out.print("Digite um numero:");
			vetor[i] = sc.nextDouble();
			somaVetores = somaVetores + vetor[i];
		}
		media = somaVetores / n;
		System.out.printf("MEDIA DO VETOR = %.3f\n",media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vetor.length; i++) {
			if (media > vetor[i]) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
		
		
		sc.close();

	}

}
