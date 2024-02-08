public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача 2
        System.out.println("Задача 2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Задача 3
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача 4
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача 5
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }

        // Задача 6
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        // Задача 7
        System.out.println("\nЗадача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        // Задача 8
        System.out.println("\nЗадача 8");

        int myMonthlySavings = 29000;
        int myTotalOfAnnualSavings = 0;

        for (int i = 0; i < 12; i++) {
            myTotalOfAnnualSavings = myTotalOfAnnualSavings + myMonthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + myTotalOfAnnualSavings + " рублей.");
        }

        // Задача 9
        System.out.println("Задача 9");

        myMonthlySavings = 29000;
        myTotalOfAnnualSavings = 0;

        for (int i = 0; i < 12; i++) {
            myTotalOfAnnualSavings = myTotalOfAnnualSavings + myTotalOfAnnualSavings / 100;
            myTotalOfAnnualSavings = myTotalOfAnnualSavings + myMonthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + myTotalOfAnnualSavings + " рублей.");
        }

        // Задача 10
        System.out.println("Задача 10");

        int firstMultiplier = 2;
        int secondMultiplier = 0;
        int composition = 0;

        for (int i = 0; i < 10; i++) {
            secondMultiplier++;
            composition = composition + 2;
            System.out.println(firstMultiplier + "*" + secondMultiplier + "=" + composition);
        }
    }
}