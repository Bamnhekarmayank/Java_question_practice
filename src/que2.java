import java.util.Scanner;

public class que2 {
    //2. Positive, negative ya zero check karo.
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0){
            System.out.println("positive number");
        } else if (num <0) {
            System.out.println("Negative number");
        }else System.out.println("Zero number");
    }
}
