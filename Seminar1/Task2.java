// 1:32:50
package Seminar1;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
// Получение данных из терминала через Senser.
        Scanner iScanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
// Считываем строку с консоли
        String name = iScanner.nextLine();
// Форматированный вывод
        int hour = LocalDateTime.now().getHour();
        String text = "";
       

        if ((hour >= 5) && (hour < 12)) text= "Доброе утро, ";
        else if ((hour >= 12) && (hour < 18)) text= "Добрый день, ";
        else if ((hour >= 18) && (hour < 23)) text= "Добрый вечер, ";
        else text= "Доброй ночи, ";
        

        System.out.printf("%s %s", text, name);
// Сканер надо закрыть 
        iScanner.close();
    }
}
