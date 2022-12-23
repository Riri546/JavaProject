// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

package Seminar4.Homework4;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        //Задаем массив 
        int[] listMas = { 15, 55, 98, 24, 25, 1 };
        //Создаем массив, класса linkList
        LinkedList<Integer> linkList = new LinkedList<>();

        //Заполняем пустой массив 
        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        System.out.println("Исходный массив: " + linkList);

        int temp = 0;
        //Заполняем массив в обратном порядке 
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println("Перевернутый массив: " + linkList);
    }
}
