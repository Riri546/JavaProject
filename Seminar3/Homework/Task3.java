// Задание 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package Seminar3.Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Task3 {
    // Метол находит максимальное, минимальное и среднее число
    public static void main(String[] args) {
        // Объявляем списак
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(15, 545, 16, 36, 45, 75, 31));
        Collections.sort(ints);
        // Печать списка
        System.out.println("Список: " + ints);
        // Поиск и печать максимального числа
        System.out.println("Максимальное число = " + ints.get(0));
        // Поиск и печать минимального числа
        System.out.println("Минимальное число =  " + ints.get(ints.size() - 1));
        // Буферная переменная
        int sum = 0;
        // Цикл для поиска суммы всех чисел массива
        for (int i : ints) {
            sum += i;
        }
        // Поиск среднего числа с помощью суммы, которую мы получили в цикле и деления
        // этой суммы на дляну массива,
        // а так же печать
        System.out.println("Среднее число =  " + sum / ints.size());
    }
}
