
/**
 * <h1> Convert Fahrenheit to Celsius </h1>
 * This code explains how we can write a code without having return type and with out having arg
 * 
 *  @author Rahul krishnan R A
 * 	@version 1.0
 *  @since 2022-12-26
 */
import java.util.Scanner;

public class TempConvertorF2C {

	public static void main(String[] args) {
		convertFahrenToCelsius();
	}

	public static void convertFahrenToCelsius() {
		Scanner sc = null;
		try {
			System.out.println("Convert Fahrenheit to Celsius converter");
			sc = new Scanner(System.in);
			System.out.println("Enter the temperature in Fahrenheit");
			float fahrenheit = sc.nextFloat();
			float degree = (fahrenheit - 32) * 5 / 9;
			System.out.println("Great! (example without args and without return type) The Converted Fahrenheit "
					+ fahrenheit + " to Degree Celsius is " + degree);

		} finally {
			if (sc != null) {
				sc.close();
			}

		}
	}

}
