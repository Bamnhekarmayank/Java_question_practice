import java.util.Scanner;

public class que5 {
    //5. Leap year check karo.
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :");
        int yr = sc.nextInt();
        if((yr%4==0 && yr%100!=0) || yr%400==0) System.out.println(yr+ " "+"It is a leap year");
        else System.out.println("It is a not a leap year");
    }
}
