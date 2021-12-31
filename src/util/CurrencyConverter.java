package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double dollarToReal(double dollar, double qtdDollar) {
		return dollar * qtdDollar * (1.0 + IOF);
	}
}
