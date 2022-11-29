package Seminar1.Homework1;

import java.util.Scanner;

// 3. Реализовать простой калькулятор + - / * 

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Привет! Ты  попал в простой, классический калькулятор)))");
        Scanner scanner = new Scanner(System.in);
        // Ввод данных от пользователя
        System.out.print("Введи первой число: ");
        // Первое число
        int a = scanner.nextInt();
        System.out.print("Какую операцию нужно произвести? Выбери оператор (+ - * /): ");
        // Оператор
        char op = scanner.next().charAt(0);
        System.out.print("Введи второе число: ");
        // Второе число
        int b = scanner.nextInt();

        // Проверка на то какой оператор и вывод решения
        if (op == '+') {
            System.out.println(a + " + " + b + " = " + add(a, b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + minus(a, b));
        } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + mult(a, b));
        } else if (op == '/') {
            System.out.println(a + " / " + b + " = " + divide(a, b));
        } else {
            System.out.println("Не верно введен оператор(((");
        }
        scanner.close();
    }

    // Функция для сложения
    private static int add(int a, int b) {
        return a + b;
    }

    // Функция для вычетания
    private static int minus(int a, int b) {
        return a - b;
    }

    // Функция для умножения
    private static int mult(int a, int b) {
        return a * b;
    }

    // Функция для деления
    private static int divide(int a, int b) {
        // Проверка на ноль
        if ((b != 0) && (a != 0))
            return a / b;
        else
            System.out.println("На ноль нельзя делить! Я конечно выведу ноль, но запомни уже это правило!");
        return 0;
    }
}
