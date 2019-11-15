package Ex2;
import java.util.Scanner;
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("введите 1-ое целое число");
            int x = sc.nextInt();
            System.out.println("введите 2-ое целое число");
            int y = sc.nextInt();
            System.out.println("НОД " + funcNOD(x, y));
            System.out.println("НОК " + funcNOK(x, y));
        }
        catch (Exception e)
        {
            System.out.println("Введно неверное число");
        }
    }

    public static int funcNOK(int a, int b) {
       return(a *( b/funcNOD(a,b)));
    }

    public static int funcNOD(int a, int b) {
        while (a != 0 && b != 0){
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (b + a);
    }
}