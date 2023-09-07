package applications;

import java.util.Locale;
import java.util.Scanner;


public class dados_Pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double menor_Altura, maior_altura, media_mulheres,soma_alturas;
		int contm, contf;
		
		soma_alturas = 0;
		contm = 0;
		contf = 0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double altura[] = new double[n];
		char sexo[] = new char [n];
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa:",i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa (F/M):", i+1);
			sexo[i] = sc.next().charAt(0);
		}
		menor_Altura = altura[0];
		maior_altura = altura[0];
		
		for(int i = 0; i < n; i++) {
			if(altura[i] > maior_altura){
				maior_altura = altura[i];
			}
			if(altura[i] < menor_Altura ){
				menor_Altura = altura[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(sexo[i] == 'F' ) {
				soma_alturas = soma_alturas + altura[i];
				contf ++;
			}
		}
		media_mulheres = soma_alturas / contf;
		for(int i = 0; i < n; i++) {
			if(sexo[i] == 'M' ) {
				 contm ++;
			}
		}
		System.out.printf("Menor altura = %.2f\n",menor_Altura);
		System.out.printf("Maior altura = %.2f\n",maior_altura);
		System.out.printf("Media das alturas das mulheres = %.2f\n",media_mulheres);
		System.out.printf("Numero de homens = %d\n",contm);
		sc.close();

	
	}
}
