// Задание №1
//Заполнить массив случайными числами. Подсчитать:
//- количество элементов которые больше своего соседа слева
//- количество четных элементов
//- количество элементов которые меньше среднего арифметического
package task1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final int SIZE = 10;
    private static final Random RANDOM = new Random();
    private static final int BOUND = 20;

    public static void main(String[] args) {

            int[] arr = fillingArray();
            System.out.println(Arrays.toString(arr));
            int evenCount = 0;
            int biggerLeftCount = 0;
            int biggerAverageCount = 0;

            double average = 0;
            for (int value : arr) {
                average += value;
            }
            average = average / arr.length;

            for (int i = 0; i < arr.length; i++) {
                if (i != 0 && arr[i] > arr[i - 1]) {
                    biggerLeftCount++;
                }
                if (arr[i] % 2 == 0) {
                    evenCount++;
                }
                if (arr[i] > average) {
                    biggerAverageCount++;
                }
            }
            System.out.printf("Это: %s - количество элементов которые больше своего соседа слева в массиве\n", biggerLeftCount);
            System.out.printf("Это: %s - количество четных элементов в массиве\n", evenCount);
            System.out.printf("Это: %s - количество элементов которые меньше среднего арифметического " +
                    "(Среднее арифметическое равно: %s) в массиве\n", biggerAverageCount, average);
        }

        private static int[] fillingArray() {
            int[] array = new int[SIZE];
            for (int i = 0; i < SIZE; i++) {
                array[i] = RANDOM.nextInt(BOUND);
            }
            return array;
        }
}
