import java.util.Scanner;

public class que12 {
    //12. Check karo number prime hai ya nahi.
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean isPrime=true;
        for (int i=2 ; i<num;i++){
            if(num%i ==0){
                isPrime =false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Number is prime");
        }else System.out.println("Not a prime");
    }
}
