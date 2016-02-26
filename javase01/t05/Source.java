//Получить матрицу: {{1, 0, ..., 0, 1},{ 0, 1, ..., 1, 0},{ 0, 0, ..., 0, 0},{0, 1, ..., 1, 0},{1, 0, ..., 0, 1}}

package javase01.t05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Source {
	public static void main(String[] args) {
		task_5_1: {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String buffer;
			int size;
            System.out.println("Enter matrix dimension: ");
            try {
                buffer = in.readLine();
                size = Integer.parseInt(buffer);
			} catch (Throwable IOException) {
                System.out.println("Input error.");
                break task_5_1;
			}
			if (size > 0) {
				byte[][] arr = new byte[size][size];
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (i == j || i == (size - j) - 1) {
							arr[i][j] = 1;
						}
					}
				}
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.print("Wrong input.");
			}
		}
	}
}