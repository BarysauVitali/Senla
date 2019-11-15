package Ex5;

class programPalindrom{
    static boolean isPalindrom(int i) {
        int next_num = 0;
        int temp = i;
        while (temp != 0) {
            next_num  = (next_num * 10) + (temp % 10);
            temp /= 10;
        }
        return (i == next_num) ;
    }
}
