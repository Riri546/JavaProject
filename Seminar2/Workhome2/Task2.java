// 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат
// после каждой итерации запишите в лог-файл.

package Seminar2.Workhome2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Arrays;

public class Task2 {
    private static File log;
    private static FileWriter fileWriter;

//Метод соания файла для логирования
    public static void main(String[] args) {
        try {
//Создаем файл
            log = new File("logFile.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
//Заводим данные для сортировки 
            int[] mas = { 5, 15, 43, 84, 4, 24};
            bubbleSort(mas);
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
//Метод для пузырьковой сортировки 
    private static int[] bubbleSort(int[] mas) {
//Заовдим переменные 
        boolean isSorted = false;
        int buffer;
//Проверяем на придмет того, какая цифра меньше или больше и в зависимости от этого меняем ее расположение. 
//Если цифра меньше, то переставляем ее вперед, если больше оставляем на месте и так проходим по массиву до 
//тех пор пока ряд чисел не встанет в порядке от меньшего к большему. Фиксируем каждый круг 
//и передаем для записи в лог-файл
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
            // System.out.println(Arrays.toString(mas));
            logStep(Arrays.toString(mas));
        }
        return mas;
    }

//Метод для записи результатов в файл логирования 
    public static void logStep(String note) {
        try {
            fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

