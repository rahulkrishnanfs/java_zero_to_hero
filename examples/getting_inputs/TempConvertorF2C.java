
/**
 * <h1> Find the Area of a Rectangle </h1>
 * This program gives you an example of how to find the area of a Rectangle
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
			System.out.println("Degree Fahrenheit to Celsius converter");
			sc = new Scanner(System.in);
			System.out.println("Enter the temperature in Fahrenheit");
			float fahrenheit = sc.nextFloat();
			float degree = (fahrenheit - 32) * 5 / 9;
			System.out.println("The Converted Celsius" + fahrenheit + " to Degree is" + degree);

		} finally {
			if (sc != null) {
				sc.close();
			}

		}

	}

}
