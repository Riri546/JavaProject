// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

package Seminar4.Homework4;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        //Задаем массив 
        int[] listMas = { 15, 55, 98, 24, 25, 1 };
        //И дополнительно создаем пустой массив 
        LinkedList<Integer> linkList = new LinkedList<>();

        //Заполняем пустой массив 
        for (Integer temp : listMas) {
            linkList.add(temp);
        }

        int temp = 0;
        //Заполняем массив в обратном порядке 
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println("linkList = " + linkList);
    }
}
