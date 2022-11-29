package Seminar1.Homework1;

import java.util.Scanner;

// 3. Реализовать простой калькулятор + - / * 

public class Task3 {
    public static void main(String[] args) {
        
        System.out.println("Привет! Ты  попал в простой, классический калькулятор)))");
        Scanner scanner = new Scanner(System.in);
        // Ввод данных от пользователя
        System.out.println("Введи первой число: ");
        //Первое число
        int a = scanner.nextInt();
        System.out.println("Какую операцию нужно произвести? Выбери оператор (+ - * /): ");
        //Оператор
        char op = scanner.next().charAt(0);
        System.out.println("Введи второе число: ");
        // Второе число
        int b = scanner.nextInt();
        
            if (op == '+'){
                System.out.println(a + " + " + b + " = " + add(a, b));
            } 
            else if (op == '-'){
                System.out.println(a + " - " + b + " = " + minus(a, b));
            }   
    
            case '-':
                System.out.println(a + " - " + b + " = " + minus(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + mult(a, b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + divide(a, b));
                break;
            default:
                System.out.println("Wrong operation!");
        }
        scanner.close();
    }

    private static int divide(int a, int b) {
        if (b != 0)
            return a / b;
        else
            return -1;
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
