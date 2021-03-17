// Задание №4
//4*) Подсчитать количество треугольников, у которых стороны заданы целыми числами, и площадь которых не больше 100.
//4.1*) Сделать задание так чтобы не было повторяющихся треугольников, например (3,4,5) и (5,3,4) - повторяющиеся.
package task4;

public class Main {

    public static final int MAX_AREA = 100;
    public static final int MAX_SIDE = 200;

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= MAX_SIDE; i++) {
            for (int j = i; j <= MAX_SIDE; j++) {
                for (int k = j; k <= MAX_SIDE; k++) {
                    if (i + j > k) {
                        double p = (i + j + k) / 2.0;
                        double square = Math.sqrt(p * (p - i) * (p - j) * (p - k));
                        if (square <= MAX_AREA) {
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}

