//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции: F(x) = tg(2x) - 3.

package javase01.t03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.tan;
import java.text.DecimalFormat;


public class Source{
    public static void main(String[] args) {
        task_3_1: {
            System.out.println("Task 3.1: ");
            int start, end, step;
            String buffer;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter range limits for X, and step size: ");
            try {
                buffer = in.readLine();
                start = Integer.parseInt(buffer);
                buffer = in.readLine();
                end = Integer.parseInt(buffer);
                buffer = in.readLine();
                step = Integer.parseInt(buffer);
            } catch (Throwable IOException) {
                System.out.println("Input error.");
                break task_3_1;
            }
            if (start > end) {
                int temp = start;
                start = end;
                end = temp;
            }
            int length = 0;
            if (start >= 0 && end >= 0) {
                length = (end - start) / step;
            } else {
                length = -(start - end) / step;
            }
            length++;
            DecimalFormat twoDigits = new DecimalFormat("#.##");
            Integer[] X = new Integer[length];
            Double[] Y = new Double[length];
            for (int i = 0; i < X.length; i++) {
                X[i] = start + step * i;
                Y[i] = tan((double)X[i] * 2) - 3;
            }
            System.out.println("Arguments: \t Values:");
            for (int i = 0; i < X.length; i++) {
                System.out.println("\t" + X[i] + "\t\t" + twoDigits.format(Y[i]));
            }
        }
    }
}