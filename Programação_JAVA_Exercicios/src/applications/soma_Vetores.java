package applications;

import java.util.Locale;
import java.util.Scanner;

public class soma_Vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int vetA[] = new int [n];
		int vetB[] = new int [n];
		int vetResul[] = new int [n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0 ;i <vetA.length; i++) {
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0 ;i <vetA.length; i++) {
			vetB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		for(int i = 0 ;i <vetA.length; i++) {
			vetResul[i] = vetA[i] + vetB[i];
			System.out.printf("%d\n",vetResul[i]);
		}
		sc.close();

	}

}
