package homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_1 {

    @Test
    @DisplayName("1-ая задача")
    public void hW1() {
        int wholeNumber = (int) (Math.random()*(300+1));
        if (wholeNumber > 0 && wholeNumber < 10)
            System.out.println("однозначное положительное ");
        else if (wholeNumber > 9 && wholeNumber <100)
            System.out.println("двузначное положительное ");
        else
            System.out.println("трехзначное положительное ");
        System.out.println(wholeNumber);
    }

    @Test
    @DisplayName("2-ая задача")
    public void hW2() {
        int a = 1;
        int b = 3;
        int c = 5;
        if (a > b + c)
            System.out.println("a > b + c" + " Треугольник существует");
        else if (b > a + c)
            System.out.println("b > a + c" + " Треугольник существует");
        else if (c > a + b)
            System.out.println("c > a + b" + " Треугольник существует");
        else
            System.out.println("Треугольник НЕ существует");
    }

    @Test
    @DisplayName("3-ая задача")
    public void hW3() {
        int number = (int) (Math.random()*(20+1)) - 10;
        if (number > 0 && number <= 20)
            System.out.println(number +1);
        else if (number < 0 && number >= -20)
            System.out.println( number -2 );
        else if ( number == 0 )
            System.out.println(number == 10);
    }

    @Test
    @DisplayName("4-ая задача")
    public void hw4() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int positive = 0;

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > 0) positive++;
        }
        System.out.println("количество положительных чисел: " + positive);
    }

    @Test
    @DisplayName("5-ая задача")
    public void hW5() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 2; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > 0) positive++;
            if (a < 0) negative++;
        }
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }

    @Test
    @DisplayName("6-ая задача")
    public void hW6() {
        Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt();

        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    @Test
    @DisplayName("7-ая задача")
    public void hw7() {
        int random = (int) (Math.random()*(10+1));
        if (random == 1)
            System.out.println(random + " программист");
        else if ( random >= 2 && random <= 4 )
            System.out.println(random + " программиста");
        else if ( random >= 5 && random <= 9 )
            System.out.println(random + " программистов");
        else
            System.out.println(random + " программистов");
    }

    @Test
    @DisplayName("8-ая задача")
    public void hW8() {
        int days = 1;
        double kmStart = 10;
        double km = 10;

        while (km <= 100) {
            kmStart = kmStart + (kmStart * 0.1);
            km = km + kmStart;
            days++;
        }
        System.out.print("ANSWER: " + km + " = " + days);
    }

    @Test
    @DisplayName("9-ая задача")
    public void hW9() {
        int a = 3;
        while ( a <= 24 ) {
            System.out.print ( a + " ");
            a += 3;
        }
    }

    @Test
    @DisplayName("10-ая задача")
    public void hW10() {
        int a = 1;
        while ( a <= 256 ) {
            System.out.print ( a + " ");
            a *= 2;
        }
    }

    @Test
    @DisplayName("11-ая задача")
    public void hW11() {
        int a=3;
        int b=4;
        int c=0;
        for ( ;b>0; b--, c+=a );
        System.out.println(c);
    }

    @Test
    @DisplayName("12-ая задача")
    public void hW12() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }

    @Test
    @DisplayName("13-ая задача")
    public void hW13() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    @Test
    @DisplayName("14-ая задача")
    public void hW14() {
        int num = 100;
        int count = num / 2;
        int summ = 0;
        for(int i = 1; i <= num; i++) {
            if( i%2 != 0) {
                summ = summ + i;
            }
        }
        int average = summ / count;
        System.out.println("Общая сумма нечетных чисел: "+ summ);
        System.out.println("Среднее математическое суммы нечетных чисел: "+ average);
    }


    @Test
    @DisplayName("15-ая задача")
    public void hW15() {
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    @DisplayName("16-ая задача")
    public void hW16() {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print( n0+" "+n1+" " );
        for(int i = 3; i <= 11; i++){
            n2=n0+n1;
            System.out.print( n2+" " );
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }

    @Test
    @DisplayName("17-ая задача")
    public void hW17() {
        int n;
        int count = 0;
        System.out.print("Вводите ваше натуральное число - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        System.out.print("Число " + n + " делится на - " );
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Количество делителей - " + count);
    }

    @Test
    @DisplayName("18-ая задача")
    public void hW18() {
        int n = 4;
        int i;
        for( i = 2; i < n ; i++)
        {
            if (n % i == 0)
                System.out.println("число составное ");
            else
                System.out.println("число  простое ");
        }
    }


    @Test
    @DisplayName("19-ая задача")
    public void hW19() {
        int a = 45;
        int sum = 0;
        while ( a > 0 ) {
            sum += a % 10;
            a /= 10;
            System.out.println(sum);
        }
    }
}