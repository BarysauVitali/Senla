package Ex5;


import java.util.Scanner;

public class Solution5 {
    static int val_min = 0;
    static int val_max = 100;
    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Введите длину последовательности  от 0 до 100: ");
        int num = length.nextInt();
        if ((num > val_min && num < val_max)) {
           for (int i = val_min; i <= num; i++) {
               if (programPalindrom.isPalindrom(i)) System.out.println(i);
           }
        } else System.out.println("Длина последовательности должна быть от 0 до 100");
    }
}

