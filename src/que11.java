import java.util.Scanner;
//11. Number ka factorial find karo.
public class que11 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int f=1;
        for (int i=1;i<=num;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}
