package homework;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class HomeWork_2 {

    @Test
    @DisplayName("1-ая домашняя задача")
    public void hW1() {
        int[] massive = new int[10];
        int aa = 2;

        for (int i = 0; i < massive.length; i++) {
            massive[i] = aa;
            aa = aa + 2;
            System.out.print(massive[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(massive[i]);
        }
    }

    @Test
    @DisplayName("2-ая домашняя задача")
    public void hW2() {
        int counter = 0;
        for (int i = 1; i < 100; i += 2) {
            counter++;
        }

        int[] massive1 = new int[counter];
        int m = 1;

        for (int i = 0; i < massive1.length; i++) {
            massive1[i] = m;
            m = m + 2;
            System.out.println(massive1[i] + " ");
        }

        System.out.println("Обратный отсчёт");

        for (int i = counter - 1; i >= 0; i--) {
            System.out.println(massive1[i] + "");
        }
    }

    @Test
    @DisplayName("3-я домашняя задача")
    public void hw3() {
        int b = 0;
        int[] Mas = new int[15];
        for (int i = 0; i < Mas.length; i++) {
            Random rnd = new Random();
            Mas[i] = rnd.nextInt(10);
            System.out.print(Mas[i] + " ");
            if (Mas[i] > 0 & Mas[i] % 2 == 0) b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + b + " четных");
    }

    @Test
    @DisplayName("4-я домашняя задача")
    public void hW4() {
        int[] Mas = new int[20];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 19 + 1);
            System.out.print(Mas[i] + " ");
        }
        for (int i = 0; i < Mas.length; i++) {
            if (Mas[i] % 2 != 0) Mas[i] = 0;
            System.out.println(Mas[i] + "");
        }
    }

    @Test
    @DisplayName("5-я домашняя задача")
    public void hW5() {
        double sumMas1 = 0, sumMas2 = 0;
        int[] Mas1 = new int[5];
        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = (int) (Math.random() * 6);
            System.out.print(Mas1[i] + " ");
            sumMas1 += (double) Mas1[i] / Mas1.length;
        }
        System.out.println(" ");
        int[] Mas2 = new int[5];
        for (int i = 0; i < Mas2.length; i++) {
            Mas2[i] = (int) (Math.random() * 6);
            System.out.print(Mas2[i] + " ");
            sumMas2 += (double) Mas2[i] / Mas2.length;
        }
        System.out.println(" ");
        if (sumMas1 == sumMas2) System.out.println("Средние арифметические значения двух массивов равны");
        else {
            if (sumMas1 > sumMas2)
                System.out.println("Среднее арифметическое значение первого массива больше и равно ");
            else System.out.println("Среднее арифметическое значение второго массива больше и равно ");
        }
    }

    @Test
    @DisplayName("6-я домашняя задача")
    public void hW6() {
        int[] Mas = new int[4];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(Mas[i] + " ");
        }
        for (int i = 0; i < Mas.length; i++) {
            if (i > 0) {
                if (Mas[i - 1] >= Mas[i]) {
                    System.out.println("Прогрессия не возрастающая");
                    break;

                }
            }
            if (i == Mas.length - 1)
                System.out.println("Последовательность строго возрастающая");
        }
    }

    @Test
    @DisplayName("7-я домашняя задача")
    public void hW7() {
        int mas1[] = new int[12];

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) Math.floor(Math.random() * 15);
            System.out.print(mas1[i] + " ");

        }
        int max = mas1[0], index = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] >= max) {
                max = mas1[i];
                index = i;
            }
        }
        System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + index);
    }

    @Test
    @DisplayName("8-я домашняя задача")
    public void hW8() {
        int[] Mas1 = new int[10];
        int[] Mas2 = new int[10];
        double[] Mas3 = new double[10];
        int SC = 0;
        for (int i = 0, b = 1; b <= 4; i++) {
            if (b == 1) {
                Mas1[i] = (int) (Math.random() * 8) + 1;
                if (i == 0)
                    System.out.print((b) + " массив состоит из следующих элементов: ");
                System.out.print(Mas1[i] + " ");
                if (i == Mas1.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if (b == 2) {
                Mas2[i] = (int) (Math.random() * 8) + 1;
                if (i == 0)
                    System.out.print((b) + " массив состоит из следующих элементов: ");
                System.out.print(Mas2[i] + " ");
                if (i == Mas2.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if (b == 3) {
                Mas3[i] = (double) Mas1[i] / Mas2[i];
                if (i == 0)
                    System.out.print((b) + " массив состоит из следующих элементов: ");
                System.out.print(Mas3[i] + " ");
                if (i == Mas3.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }

            if (b == 4) {
                if (Mas3[i] % (int) Mas3[i] == 0) {
                    if (SC == 0)
                        System.out.print("В 3 массиве следующие целые числа: ");
                    SC++;
                    System.out.print(Mas3[i] + ", ");
                }
                if (i == Mas3.length - 1) {
                    if (SC == 0)
                        System.out.println("В третьем массиве нет целых чисел!");
                    break;
                }
            }

        }
    }

    @Test
    @DisplayName("9-я домашняя задача")
    public void hW9() {
        int a,lCount=0,rCount=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите четное число");
        if (scn.hasNextInt()){
            do{
                a=scn.nextInt();
                if(a%2!=0||a<1)System.out.println("Вы ошиблись, введите повторно четное число!");
            }
            while(a%2!=0||a<1);
            int[] Mas = new int[a];
            for(int i=0;i<Mas.length;i++){
                Mas[i]=(int)(Math.random()*11)-5;
                System.out.print(Mas[i]+" ");
                if(i<=Mas.length/2-1){
                    lCount+=Math.abs(Mas[i]);
                }
                else {
                    rCount+=Math.abs(Mas[i]);
                }
                if(i==Mas.length-1){
                    System.out.println(" ");
                    if(lCount>rCount)
                        System.out.println("Сумма модулей первой половины массива больше и равна "+lCount);
                    if(rCount>lCount)
                        System.out.println("Сумма модулей второй половины массива больше и равна "+rCount);
                    if(rCount==lCount)
                        System.out.println("Суммы модулей первой и второй половины равны");
                }
            }
        }
        else System.out.println("Введено не число");
    }

    @Test
    @DisplayName("10-я домашняя задача")
    public void hW10() {
        int n = 0, c = 0;
        do{
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число большее 3");
            if(scn.hasNextInt()){
                n=scn.nextInt();
            }
            else System.out.println("Ошибка. Вы ввели не число!");
        }
        while ( n < 4 );
        int[] Mas1 = new int[n];
        for(int i = 0; i < Mas1.length; i++){
            Mas1[i]=(int)(Math.random()*( n + 1 ));
            System.out.print(Mas1[i]+" ");
            if(Mas1[i]%2==0&Mas1[i]!=0)c++;
        }
        System.out.println("");
        if( c > 0 ){
            int[] Mas2 = new int[c];
            for(int i = 0, b = 0; i < Mas1.length; i++){
                if (Mas1[i]%2==0&Mas1[i]!=0){
                    Mas2[b]=Mas1[i];
                    System.out.print(Mas2[b]+" ");
                }
            }
        }
    }

    @Test
    @DisplayName("11-я домашняя задача")
    public void hW11() {
        int [] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    @Test
    @DisplayName("12-я домашняя задача")
    public void hW12() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        // printing array
        System.out.println("Created array:");
        ArrayList<Integer> unicArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int comparedElement;
        int i, k;
        for (i = 0; i < array.length; i++) {
            comparedElement = array[i];
            for (k = 0; k < array.length; k++) {
                if (i != k && comparedElement == array[k]) {
                    // adding repeatable elements in array
                    unicArray.add(array[k]);
                }
            }
        }
        System.out.println();
        HashSet<Integer> integerHashSet = new HashSet<>(unicArray);
        if (integerHashSet.size() != 0) {
            System.out.println("Not all elements are different!");
            System.out.println("There are repeatable elements in array: ");
            // printing unic elements in array
            for (Integer m : integerHashSet) {
                System.out.println(m);
            }
        } else System.out.println("All elements are different!");
    }

    @Test
    @DisplayName("13-я домашняя задача")
    public void hW13() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        // printing array
        System.out.println("Created array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //changing second element
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println();
        System.out.println("New array with replacement each second element by zero: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Test
    @DisplayName("14-я домашняя задача")
    public void hW14() {
        int num [] = {5, 8, 12, -18, -54, 84, -35, 17, 37};
        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/num.length);
    }
    @Test
    @DisplayName("15-я домашняя задача")
    public void hW15() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        // printing array
        System.out.println("Created array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int arrayMin = array[0];
        // searching the lowest element in array
        for (int i = 0; i < array.length; i++) {
            if (arrayMin >= array[i] && array[i] % 2 != 0) {
                arrayMin = array[i];
            }
        }
        System.out.println();
        System.out.println("Min odd element in array --> " + arrayMin);
    }

    /*
    «Сожмите» массив, выбросив из него каждый второй элемент. «Освободившиеся» места массива заполните нулями.
     */
    @Test
    @DisplayName("16-я домашняя задача")
    public void hW16() {

    }

    /*
    Проверить, различны ли все элементы массива.
     */
    @Test
    @DisplayName("17-я домашняя задача")
    public void hW17() {

    }

    @Test
    @DisplayName("18-я домашняя задача")
    public void hW18() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int number = scan.nextInt();
        int[] arr = new int[number];
        int max = 0;

        for (int i = 0; i < number; i++) {
            System.out.printf("Введите %d-е число: ", i + 1);
            arr[i] = scan.nextInt();
            if (arr[i] > max) max = arr[i];
        }
        int count = 0;
        for (int anArr : arr) {
            if (anArr == max) count++;
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Максимальных элементов всего: " + count);
    }

    @Test
    @DisplayName("19-я домашняя задача")
    public void hW19(int arr[]) {
        int maxOne=arr[0];
        int maxTwo=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxOne){
                maxTwo=maxOne;
                maxOne=arr[i];
            }else if (arr[i]>maxTwo) {
                maxTwo=arr[i];
            }
        }
        System.out.println(maxOne);
        System.out.println(maxTwo);
    }

    @Test
    @DisplayName("20-я домашняя задача")
    public int hW20(int[]array) {
        int min=array[0];
        int temp=0;
        for(int i=0;i<array.length;i++){
            if(i%2==0){
                if((temp=array[i])<min){
                    min=temp;
                }
            }
        }
        return min;
    }

    @Test
    @DisplayName("21-я домашняя задача")
    public void hW21() {
        Random rand = new Random();
        int size = 25;
        int[] array = new int[size];
        int min = 0;
        int max = 0;
        int temp;

        for ( int i = 0; i < size; i++ ) {
            array[i] = rand.nextInt(100);
            if ( array[min] > array[i] ) min = i;
            if ( array[max] < array[i] ) max = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min: "+"array["+min+"]="+array[min]);
        System.out.println("Max: "+"array["+max+"]="+array[max]);

        temp = array[min];
        array[min] = array[max];
        array[max] = temp;

        System.out.println(Arrays.toString(array));
    }
}