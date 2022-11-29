package Seminar1.Homework1;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {
        // Вводное сообщение пользователю
        System.out.print("Калькулятор вычисляет треугольное число и факториал.\n");
        // Получение данных из терминала через Senser.
        Scanner iScanner = new Scanner(System.in);
        System.out.print("n = ");
        // Считываем строку с консоли
        int n = iScanner.nextInt();
        // Ответы пользователю по заданию
        System.out.printf("Сумма от 1 до n равна %s\n", triangularNumber(n));
        System.out.printf("Произведение от 1 до n равно %s", factorial(n));
        iScanner.close();
    }
    public static int triangularNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;

        }
        return sum;
    }    
    public static int factorial(int number) {
        int f = 1;
        for (int i = 1; i <= number; i++) {
            f *= i;
            
        }
        return f;
    }    
}
