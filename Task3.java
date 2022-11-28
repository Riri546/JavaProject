package Seminar1;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] == 1) && (arr[i - 1] == 1))
                count++;
            else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        System.out.println(max);
    }

}
