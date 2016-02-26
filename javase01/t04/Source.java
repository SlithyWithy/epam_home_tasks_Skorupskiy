//Даны действительные числа a1, a2 … an.  Найти max(a1+an, a2+an-1, a3+an-2...).

package javase01.t04;

import java.util.Random;

public class Source {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        Integer arr[] = new Integer[10];
        long max = 0;
        int index = 0;
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt()%1000;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length / 2; i++) {
            if (max < arr[i] + arr[(arr.length - i) - 1]) {
                max = arr[i] + arr[(arr.length - i) - 1];
                index = i;
            }
        }
        System.out.println("Maximum is: " + max + " , a sum of " + (index + 1) + "th and " + (arr.length-index) + "th elements.");
    }
}