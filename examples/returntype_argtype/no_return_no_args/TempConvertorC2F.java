
/**
 * <h1> Convert Degree Celsius to Fahrenheit </h1>
 * This code explains how we can write a code without having return type and with out having arg
 * 
 *  @author Rahul krishnan R A
 * 	@version 1.0
 *  @since 2022-12-26
 */
import java.util.Scanner;

class TempConvertorC2F {

	public static void main(String[] args) {
		convertCelciusToFahren();
	}

	public static void convertCelciusToFahren() {
		Scanner sc = null;
		try {
			System.out.println("Degree Celsius to Fahrenheit converter");
			sc = new Scanner(System.in);
			System.out.println("Enter the temperature in Degree Celcious");
			double degree = sc.nextFloat();
			double fahrenheit = degree * 1.8 + 32;
			System.out.println("Great! (example without args and without return type) The Converted Celsius " + degree
					+ " to Fahrenheit is " + fahrenheit);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
