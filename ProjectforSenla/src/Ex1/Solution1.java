package Ex1;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("enter integer number");
            int num = sc.nextInt();
            if (num != 0) {
                funcOddEven(num);
                if (num < 0) System.out.println("Number can't be prime or not prime");
                else {
                    if (funcPrime(num)) System.out.println("Number is not prime");
                    else System.out.println("Number is prime");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid number");
        }
    }

    public static void funcOddEven(int n){
        if (n % 2 == 0) System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
    public static boolean funcPrime(int n) {
        if (n == 1 || n == 2) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
            break;
        }
        return true;
    }
}
