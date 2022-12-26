
/**
 * <h1> Find the Area of a Rectangle </h1>
 * This program gives you an example of how to find the area of a Rectangle
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
			double fahrenheit = degree * 1.8 + 32;
			System.out.println("The Converted Celsius" + degree + " to Fahrenheit is" + fahrenheit);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
