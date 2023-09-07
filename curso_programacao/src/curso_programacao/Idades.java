package curso_programacao;
import java.util.Locale;
import java.util.Scanner;


public class Idades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade1, idade2;
		String nome1, nome2;
		double media;
		
		System.out.println("Dados da primeira pessoa:");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Dados da segunda pessoa:");
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		media = (double)(idade1+idade2)/2;
		
		System.out.println("A idade média de" +nome1 +" e "+ nome2 +" é de "+ String.format("%.1f", media) +" anos");
		
		sc.close();
	
	}

}
