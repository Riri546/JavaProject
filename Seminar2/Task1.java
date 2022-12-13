package Seminar2;
 
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Получение данных из терминала через Scsner. Надо import.util.Scaner;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        // Считываем строку с консоли
        String nString = iScanner.nextLine();
        // Преоброзовываем в int
        int n = Integer.parseInt((nString));
        System.out.print("Введите смвол с1: ");
        // считываем строку из консоли
        String c1 = iScanner.nextLine();
        System.out.print("Введите смвол с2: ");
        // считываем строку из консоли
        String c2 = iScanner.nextLine();
        // закрываем сканер
        iScanner.close();

        StringBuilder sres = new StringBuilder();

        // for(int i =1; i<=n/2; i ++){
        // sres.append(c1+c2);
        // }
        // System.out.print(sres);
        sres.append((c1 + c2).repeat((Math.max(0, n / 2))));
        System.out.print(sres);
    }
}
