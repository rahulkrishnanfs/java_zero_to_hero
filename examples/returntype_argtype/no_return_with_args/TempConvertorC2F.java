
/**
 * <h1> Degree Celsius to Fahrenheit </h1>
 * This program gives you an example of how to convert Degree Celsius to Fahrenheit and code explains how we can write a code without having return type and 
 * with arg
 * 
 *  @author Rahul krishnan R A
 * 	@version 1.0
 *  @since 2022-12-26
 */
import java.util.Scanner;

class TempConvertorC2F {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			System.out.println("Degree Celsius to Fahrenheit converter");
			sc = new Scanner(System.in);
			System.out.println("Enter the temperature in Degree Celcious");
			double degree = sc.nextFloat();
			convertCelciusToFahren(degree);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
	public static void convertCelciusToFahren(double degree){
		double fahrenheit = degree * 1.8 + 32;
		System.out.println("Great! (example with args and without return type) The Converted Celsius" + degree + " to Fahrenheit is" + fahrenheit);
	}
}
