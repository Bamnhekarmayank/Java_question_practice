//17. Count digits in a number.

import java.util.Scanner;

public class que17 {
    static int countDigitsInNumber(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            num = num / 10; // --> no.short
            count++; //--> count + every at digit out
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println("NO. of digits :" + countDigitsInNumber(number));
    }
}
