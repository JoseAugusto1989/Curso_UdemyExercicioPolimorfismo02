package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class StartApp {
	
	static Scanner scan = new Scanner(System.in);
	static List<Pessoa> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.print("Enter the number of the tax payers: "); 
			int num = readInteger();
			
		for (int i=1; i<=num; i++) {
			System.out.println("\nTax payer #" + i + " data: ");
			
			System.out.print("Individual or Company (i/c): ");
				char x = scan.next().charAt(0);	scan.nextLine();
			System.out.print("Name: ");
				String name = scan.nextLine();
			System.out.print("Anual income: ");
				double anual = readDouble();
				
			checkPerson(x, name, anual);
		}
		
		double soma = 0;
		System.out.println("\nTAXES PAID:");
		for (Pessoa pes : list) {
			System.out.println(pes.getName() + ": R$ " + String.format("%.2f", pes.calculo()));
			soma += pes.calculo();
		}
		
		System.out.println("TOTAL TAXES: R$ " + String.format("%.2f", soma));
		
		scan.close();
	}
	
	private static void checkPerson(char x, String name, double anual) {
		
		if (x == 'i' || x == 'I') {
			System.out.print("Health expenditures: ");
				double healt = readDouble();
				
		list.add(new PessoaFisica(name, anual, healt));
			
		} else if (x == 'c' || x == 'C') {
			System.out.print("Number of Employees: ");
				int emp = readInteger();
				
		list.add(new PessoaJuridica(name, anual, emp));
			
		} else {
			System.out.println("Invalid Option");
		}
		
	}
	
	private static int readInteger() {
		int value = scan.nextInt();   scan.nextLine();
		return value;
	}
	
	private static double readDouble() {
		double value = scan.nextDouble();   scan.nextLine();
		return value;
	}

}
