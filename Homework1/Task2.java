package Seminar1.Homework1;

// Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        // Цикл собирает все числа от 1 до 1000. Для того, что бы на консоль вывелась 1000, а не 999, указываю 1001
        for (int i = 1; i < 1001; i++) {
                // System.out.println(i);
                if ((i % 1) == 0){
                    count = i;
                    System.out.println(count);
                }
                else if ((i % i) == 0){
                    count = i;
                    System.out.println(count);
                }
                else{
                    i++;
                }
            }
        }
        
    }

