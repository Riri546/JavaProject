// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package Seminar4.Homework4;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        // Задаем массив
        int[] list = { 1, 5, 4, 46, 9, 7, 8, 74, 8 };
        // Создаем массив, класса linkList и заполняем исходным
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        // Выаодим исходный массив
        System.out.println("Исходный массив: " + linkList);

        enqueue(linkList, 555);
        System.out.println("Помещаем в конец очереди элеммент '555': " + linkList);

        dequeue(linkList);
        // System.out.println(dequeue(linkList));
        System.out.println("Возвращаем первый элемент из очереди и удаляет его: " + linkList);

        first(linkList);
        System.out.println("Возвращаем первый элемент из очереди, не удаляя: " + linkList);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
