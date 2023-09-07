package applications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		List<Product> product = new ArrayList<>();
		
		for(int j=1; j<=n; j++) {
			System.out.println("Product #"+j+" data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'c') {
				product.add(new Product(name, price));
			}
			
			else if(ch == 'u') {
				System.out.print("Manufactura Date:(DD/MM/YYYY) ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				product.add(new UsedProduct(name, price, date));
			}
			
			else{
				System.out.print("Custems fee: ");
				double customsfee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customsfee));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS");
		
		for(Product prod: product) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
