package Seminar2.Workhome2;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 3. Реализовать простой калькулятор + - / * 
public class Task5 {

    private static File log;
    private static FileWriter fileWriter;

    // Метод соания файла для логирования
    public static void main(int result) {
        try {
            // Создаем файл
            log = new File("calculatorLog.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            // Запускаем методы
            model(result);
            logStep(result);
            // Делаем проверку на сбои, что бы не возникало ошибок
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void model(int res) {

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
            res = add(a, b);
            System.out.println(a + " + " + b + " = " + res);
        } else if (op == '-') {
            res = minus(a, b);
            System.out.println(a + " - " + b + " = " + res);
        } else if (op == '*') {
            res = mult(a, b);
            System.out.println(a + " * " + b + " = " + res);
        } else if (op == '/') {
            res = divide(a, b);
            System.out.println(a + " / " + b + " = " + res);
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

    // Метод для записи результатов в файл логирования
    public static void logStep(int note) {
        try {
            fileWriter.write(note);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}