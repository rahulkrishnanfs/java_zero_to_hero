
/**
 * <h1> Program to find the area of a Triangle </h1.
 * This code explains how we can write a code without having return type and 
 * with arg
 * 
 *  @author Rahul krishnan R A
 * 	@version 1.0
 *  @since 2022-12-26
 */
import java.util.Scanner;

class Triangle {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {

			System.out.println("This program helps to find the area of a triangle");
			scanner = new Scanner(System.in);
			System.out.println("Enter the base of the triangle");
			float base = scanner.nextFloat();
			System.out.println("Enter the height of the triangle");
			float height = scanner.nextFloat();
			calculateTriangleArea(base, height);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	public static void calculateTriangleArea(float base, float height) {
		System.out.println("Great! (example with args and without return type) The Area of the triangle is " + .5 * base * height);
	}

}
