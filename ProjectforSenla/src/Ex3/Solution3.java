package Ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложение");
        String string = read.readLine();
        countWordAndUpperChar(sortWords(string));
    }

    static void countWordAndUpperChar(String stringIn) {
        int countWord = 0;
        char[] c_arr = stringIn.toCharArray();
        if (c_arr[0] != 0) countWord++;
        System.out.print(Character.toUpperCase(c_arr[0]));
        for (int i = 1; i < stringIn.length(); i++) {
            if (c_arr[i] != ' ' && c_arr[i - 1] == ' ') {
                System.out.print(Character.toUpperCase(c_arr[i]));
                countWord++;
            } else
                System.out.print(c_arr[i]);
        }
        System.out.println("");
        System.out.println("Количество слов:  " + countWord);
    }

    static String sortWords(String stringIn) {
        String[] arrString = stringIn.split(" ");
        stringIn = "";
        Arrays.sort(arrString);
        for (String ss : arrString) {
            stringIn += ss + " ";
        }
        stringIn = stringIn.trim();
        return stringIn;
    }
}