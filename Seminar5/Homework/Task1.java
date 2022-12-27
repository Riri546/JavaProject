// 1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package Seminar5.Homework;

// import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class Task1 {

    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите фамилию с большой буквы и я покажу вам номера
        // телефонов этого абонента");
        // String sname = scanner.next();
        addInPhoneBook();
        // findInPhoneBook(sname);
        findInPhoneBook("Колесникова");
        // scanner.close();
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("+7(111)111-11-11", "+7(666)666-66-66"));
        phoneBook.put("Карпова", List.of("+7(555)555-55-55", "+7(666)666-66-66"));
        phoneBook.put("Петров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        phoneBook.put("Колесникова", List.of("+7(777)555-25-66", "+7(666)666-66-66"));
        phoneBook.put("Сидоров", List.of("+7(599)556-56-55", "+7(666)666-66-66"));
        phoneBook.put("Берестова", List.of("+7(555)555-55-55", "+7(666)666-66-66"));
        phoneBook.put("Косова", List.of("+7(555)555-55-55", "+7(666)666-66-66"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.print(surname + ":" + phoneBook.get(surname));
    }    
}
