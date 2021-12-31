package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is dollar price ? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought ? ");
		double qtdDollar = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(dollar, qtdDollar);
		
		System.out.printf("Amount to be paid in reais: %.2f%n", result);
		
		sc.close();
	}
}
