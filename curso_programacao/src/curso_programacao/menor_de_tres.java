package curso_programacao;

import java.util.Scanner;

public class menor_de_tres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Segundo Valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro Valor: ");
		c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println("MENOR:"+ a);
		}else if(b < c) {
			System.out.println("MENOR:"+ b);
		}else {
			System.out.println("MENOR:"+ c);
		}
		sc.close();
	}

}
