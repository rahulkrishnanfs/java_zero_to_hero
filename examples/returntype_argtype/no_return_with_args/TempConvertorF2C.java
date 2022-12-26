
/**
 * <h1> Fahrenheit to Celsius </h1>
 * This program gives you an example of how to convert Degree Fahrenheit to Celsius and code explains how we can write a code without having return type and 
 * with arg
 * 
 *  @author Rahul krishnan R A
 * 	@version 1.0
 *  @since 2022-12-26
 */
import java.util.Scanner;

public class TempConvertorF2C {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			System.out.println("Fahrenheit to Celsius converter");
			sc = new Scanner(System.in);
			System.out.println("Enter the temperature in Fahrenheit");
			float fahrenheit = sc.nextFloat();
			convertFahrenToCelsius(fahrenheit);

		} finally {
			if (sc != null) {
				sc.close();
			}

		}

	}

	public static void convertFahrenToCelsius(float fahrenheit) {
		float degree = (fahrenheit - 32) * 5 / 9;
		System.out.println("Great! (example with args and without return type) The Converted Fahrenheit " + fahrenheit + " to Degree Celsius is" + degree);
	}

}
