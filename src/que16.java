//. Sum of digits nikalna.
//Example: 123 → 6
import java.util.*;
public class que16 {
    static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            int lastdigit=num%10;
            sum+=lastdigit;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumOfDigits(number));
    }
}


