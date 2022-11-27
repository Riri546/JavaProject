// 1:32:50
package Seminar1;
import java.time.LocalTime;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
// Получение данных из терминала через Senser.
        Scanner iScanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
// Считываем строку с консоли
        String name = iScanner.nextLine();
// Форматированный вывод
        System.out.print(LocalTime.now());
    }
}
