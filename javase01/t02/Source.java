//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.
package javase01.t02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.text.DecimalFormat;

public class Source {
	public static void main(String[] args) {
		task_2_1: {
			System.out.println("Task 2.1: ");
			int input;
			String buffer;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a 4-digit number: ");
			try {
				buffer = in.readLine();
				input = Integer.parseInt(buffer);
			} catch (Throwable IOException) {
				System.out.println("Input error.");
				break task_2_1;
			}
			if (input > -10000 && input < 10000) {
				if (input < 0) {
					input = -input;
				}
					Integer arr[] = new Integer[4];
					for (int i = 0; i < 4; i++) {
						arr[3 - i] = input % 10;
						input /= 10;
					}
				if (arr[0] + arr[1] == arr[2] + arr[3]) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
			} else {
				System.out.println("Wrong input.");
			}
		}
		task_2_2: {
			System.out.println("Task 2.2: ");
			int side1, side2;
			String buffer;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter sides of a triangle: ");
			try {
				buffer = in.readLine();
				side1 = Integer.parseInt(buffer);
				buffer = in.readLine();
				side2 = Integer.parseInt(buffer);
			} catch (Throwable IOException) {
				System.out.println("Input error.");
				break task_2_2;
			}
			if (side1 > 0 && side2 > 0) {
				DecimalFormat twoDigits = new DecimalFormat("#.##");
				double perimeter, area;
				perimeter = side1 + side2 + (sqrt(pow(side1, 2) + pow(side2, 2)));
				area = side1 * side2/2;
				System.out.println("Perimeter = " + twoDigits.format(perimeter));
				System.out.println("Area = " + twoDigits.format(area));
			}
			else {
				System.out.println("Wrong input.");
			}
		}
	}
}