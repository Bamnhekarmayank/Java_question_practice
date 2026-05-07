import java.util.Scanner;

public class que8 {
    //8. 1 se N tak even numbers print karo.
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num = s.nextInt();
        int sum =0;
        for(int i=1;i<=num;i++){
            if (i%2==0){
                System.out.println(i);
            sum+=i;}
        }
        System.out.println(sum);
    }


}
