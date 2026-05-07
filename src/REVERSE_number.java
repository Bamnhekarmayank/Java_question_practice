import java.util.Scanner;

public class REVERSE_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f =1;
        for (int i =n; i>=1  ; i=i-1) {
            f*=i; //-->f=f*i
        }
        System.out.println(f);
    }
}
