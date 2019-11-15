package Ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложение");
        String stringIn = read.readLine();
        while  (stringIn.isEmpty())
        {
            System.out.println("Строка не должна быть пустой. Введите предложение");
            stringIn = read.readLine();
        }
        System.out.println("Введите одно слово по которому будет поиск");
        String stringWord = read.readLine();
        while  (stringWord.isEmpty())
        {
            System.out.println("Строка не должна быть пустой. Введите одно слово по которому будет поиск");
            stringWord = read.readLine();
        }

        int count = 0;
        String[] arrString = stringIn.split(" ");
        for (String itter : arrString)
        {
            if (itter.equalsIgnoreCase(stringWord)) count++;
        }
        System.out.println("Количество повторений слова " + stringWord + ": " + count);
    }
}
