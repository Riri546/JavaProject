package Seminar1.Homework1;

// 1. Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        // Цикл собирает все числа от 1 до 1000. Для того, что бы на консоль вывелась
        // 1000, а не 999, указываю 1001
        for (int i = 1; i < 1001; i++) {
            // Условие для запуска работы функции и вывода ответа на печать
            if (checkSimpleNumber(i) == true) {
                System.out.println(i);
            }
        }
    }

    // Функция для поиска простых чисел
    public static Boolean checkSimpleNumber(int number) {
        // цикл перебирает все числа от 1 до 1000
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Условие проверяет является ли число простым
            if ((number == 1) || (number % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
