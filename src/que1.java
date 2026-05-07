import java.util.Scanner;

public class que1 {
    //1. User se ek number input lo aur check karo even ya odd.
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0) System.out.println(n + " is even");
        else System.out.println(n + " is odd");
    }
}
