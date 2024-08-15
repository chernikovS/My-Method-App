package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Введіть ціле число: ");
        int number = scanner.nextInt();

        int squareResult = square(number);
        System.out.println("Квадрат числа " + number +
                " дорівнює " + squareResult + ".");


        System.out.print("\n2. Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();

        double volumeResult = volumeOfCylinder(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius +
                " і висотою " + height + " дорівнює " +
                volumeResult + ".");


        System.out.print("\nВведіть розмір масиву: ");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];

        System.out.print("Введіть елементи масиву: ");
        for(int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        int arraySumResult = arraySum(numbers);
        System.out.println("Масив: " + Arrays.toString(numbers)
                + "\nСума всіх елементів масиву дорівнює "
                + arraySumResult + ".");

        scanner.nextLine();

        System.out.print("\nВведіть рядок: ");
        String notReversed = scanner.nextLine();
        String reversedResult = reversedInput(notReversed);
        System.out.println("Рядок в зворотньому порядку: " + reversedResult);


        System.out.print("\nВведіть а: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();

        int raiseResult = raiseToTheNum(a, b);
        System.out.println("Результат " + a + "^" + b
                + " дорівнює " + raiseResult + ".");


        System.out.print("\nВведіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();

        textRepeat(n, text);
    }


    public static int square(int number) {
        return number * number;
    }

    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reversedInput(String notReversed) {
        StringBuilder reversed = new StringBuilder(notReversed);
        return reversed.reverse().toString();
    }

    public static int raiseToTheNum(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void textRepeat(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}