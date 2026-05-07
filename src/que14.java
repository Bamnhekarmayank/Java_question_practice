//14. Number reverse karo.
//Example: 1234 → 4321
// palindrome check also
import java.util.*;
public class que14 {
   static int reverseNumber(int num){
       int original = num;
        int rev=0;
        while (num>0){
            int lastDigit = num%10;//--> last digit
            rev = rev*10+lastDigit;//--> rev biuld
            num/=10;//--> number short
        }
        //Palindrome check
        if(rev==original){
            System.out.println("Number is Palindrome");
        }else System.out.println("Number is not Palindrome");

        return rev;
    }

   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
       System.out.println(reverseNumber(number));

    }
}
