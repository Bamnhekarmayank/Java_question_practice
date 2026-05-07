import java.util.*;
public class que3 {
    //3. Do numbers me greater number print karo.
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num 1 :");
        int n1  = sc.nextInt();
        System.out.println("Enter a num 2 :");
        int n2  = sc.nextInt();
        if (n1>n2) System.out.println(n1 + " "+ "Num_1 is greater than Num_2" );
        else System.out.println(n2+" " + "Num_2 is greater than Num_1");
    }
}
