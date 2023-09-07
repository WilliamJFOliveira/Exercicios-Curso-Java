package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;


public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n  = sc.nextInt();
		
		Pessoas[] pessoas = new Pessoas[n];
		
		for(int i = 0 ; i < pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa:\n",i + 1);
			sc.nextLine();
			System.out.printf("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double tamanho = sc.nextDouble();
			pessoas[i] = new Pessoas(name, idade, tamanho);
			
		}
		double alturaMedia = 0.0;
		int menores = 0;
		for(int i = 0; i < pessoas.length ; i++) {
			if(pessoas[i].getIdade() < 16) {
				menores = menores + 1;
			}
			alturaMedia += pessoas[i].getAltura() / n;
		}
		double percmenores = ((double)menores / n) * 100.0;
		System.out.printf("Altura média:%.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percmenores);
		for(int i = 0; i < pessoas.length ; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.printf("%s\n",pessoas[i].getName());
			}
		}
		
		sc.close();

	}

}
