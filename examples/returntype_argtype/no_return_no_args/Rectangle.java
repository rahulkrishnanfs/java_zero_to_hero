
/**
 * <h1> Find the Area of a Rectangle </h1>
 * This program gives you an example of how to find the area of a Rectangle and code explains how we can write a code without having return type and 
 * with out having arg
 * 
 *  @author Rahul krishnan R A
 * 	@version 1.0
 *  @since 2022-12-26
 */

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		calculateArea();

	}

	public static void calculateArea() {
		Scanner scanner = null;
		try {
			System.out.println("This program helps to find the area of a Rectangle");
			scanner = new Scanner(System.in);
			System.out.println("Enter the length of the Rectangle");
			float length = scanner.nextFloat();
			System.out.println("Enter the width or breadth of the Rectangle");
			float width = scanner.nextFloat();
			System.out.println("Great! (example with no args and without return type ) The Area of the Rectangle is "
					+ length * width);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}
}
