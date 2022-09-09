import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        main1();
        main2();
        main3();
        main4();
        main5();
        main6();
        main7();
        main8();
        main9();
        main10();
        main11();
        main12();
        main13();
        main14();
    }

    public static void main1() {
        //УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
        //Задание 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        switch (x) {
            case 1, 2, 12: {
                System.out.println("Зима");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Весна");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Лето");
                break;
            }
            case 9, 10, 11: {
                System.out.println("Осень");
                break;
            }
            default: {
                System.out.println("Такой поры года нету");
                break;
            }
        }
    }

    public static void main2() {
        //УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
        //Задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if (x == 1 || x == 2 || x == 12) System.out.println("Зима");
        if (x == 3 || x == 4 || x == 5) System.out.println("Весна");
        if (x == 6 || x == 7 || x == 8) System.out.println("Лето");
        if (x == 9 || x == 10 || x == 11) System.out.println("Осень");
        if (x > 12) System.out.println("Такой поры года не существует");
    }

    public static void main3() {
        //УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
        //Задание 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if (x % 2 == 0) System.out.println("Чётное!");
        else System.out.println("Нечётное!");
    }

    public static void main4() {
        //УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
        //Задание 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if (x > -5) System.out.println("Тепло");
        if (x <= -5 && x > -20) System.out.println("Нормально");
        if (x <= -20) System.out.println("Холодно");
    }

    public static void main5() {
        //УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ
        //Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        switch(x){
            case 1: {
                System.out.println("Красный");
                break;
            }
            case 2: {
                System.out.println("Оранжевый");
                break;
            }
            case 3: {
                System.out.println("Жёлтый");
                break;
            }
            case 4: {
                System.out.println("Зелёный");
                break;
            }
            case 5: {
                System.out.println("Голубой");
                break;
            }
            case 6: {
                System.out.println("Синий");
                break;
            }
            case 7: {
                System.out.println("Фиолетовый");
                break;
            }
            default: {
                System.out.println("Такого цвета в радуге нету");
                break;
            }
        }
    }
    public static void main6() {
        //ЦИКЛЫ
        //Задание 1
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0 ) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main7() {
        //ЦИКЛЫ
        //Задание 2
        for (int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main8() {
        //ЦИКЛЫ
        //Задание 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int x = scanner.nextInt();
        int s = 0;
        for (int i = 0; i < x; i++){
             s = s + i;
        }
        System.out.println(s);
    }

    public static void main9() {
        //ЦИКЛЫ
        //Задание 4
//        for (int x = 1; x < 100; x++){
//            while(x % 7 == 0) {
//                System.out.println(x + "  ");
//            }
//        }
        int x = 7;
        while (x <= 98){
            System.out.print(x+ " ");
            x += 7;
        }
        System.out.println();
    }

    public static void main10() {
        //ЦИКЛЫ
        //Задание 5
        int x = 0;
        while (x > -50) {
            System.out.print(x+ " ");
            x -= 5;
        }
        System.out.println();
    }

    public static void main11() {
        //ЦИКЛЫ
        //Задание 6
        int x = 10;
        int k = 1;
        while(x <= 20){
            k = x * x;
            System.out.print(k + " ");
            x++;
        }
        System.out.println();
    }

    public static void main12() {
        //ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ
        //Задание 1
        int x = 0;
        int y = 1;
        int s = 0;
        System.out.print( x + " " + y +" ");
        for (int i = 3; i <= 11; i++){
            s = x + y;
            x = y;
            y = s;
            System.out.print( s + " " );
        }
        System.out.println();
    }

    public static void main13() {
        //ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ
        //Задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите величину вклада: ");
        int x = scanner.nextInt();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите количество месяцев: ");
        float s = (float) x;
        int y = scann.nextInt();
        for ( int i = 1; i <= y; i++ ){
            s = s + s * 0.07f;
        }
        System.out.println("Конечная сумма вклада составляет : " + s);
    }

    public static void main14() {
        //ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ
        //Задание 3
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}


