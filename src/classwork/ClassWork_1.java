package classwork;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

public class ClassWork_1 {

    @Test
    @DisplayName("1 task")
    public void firstTask() {
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 2;
        array[2] = 15;
        array[3] = 1234;
        array[4] = 123;
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("1-ая задача");

        int[] array1 = new int[]{1, 2, 3, 4};
        for (int i = 0; i < 4; i++) {
            System.out.println(array1[i]);
        }
        System.out.println(array1[4]);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);


        Random random = new Random();
        int b = random.nextInt(100);
        System.out.println(b);
    }

    @Test
    @DisplayName("Найти в массиве из 10 значений четные и больше нуля значения")
    public void secondTask() {
        Scanner scanner2 = new Scanner(System.in);
        Random random2 = new Random();
        System.out.println("Введите размерность массива");
        int n = scanner2.nextInt();
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array2[i] = random2.nextInt(100);
            System.out.println(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (array2[i] % 2 == 0 && array2[i] > 0) {
                System.out.println(array2[i]);
            }
        }
    }
}