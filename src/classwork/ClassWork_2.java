package classwork;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ClassWork_2 {
    Random random = new Random();

    @Test
    @DisplayName("реализация алгоритма пузырькового массива и сортировка от возрастания")
    public void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Test
    @DisplayName("Двумерные массивы")
    public void twoDimensionalArrays() {
        int[][] massive = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                massive[i][j] = random.nextInt(50);
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
}