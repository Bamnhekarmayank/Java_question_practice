import java.util.Scanner;

public class que13 {
    //13. Fibonacci series print karo till N terms.
    static void printFibonacciSeries(int num){
        int firstTerm=0;
        int secondTerm=1;
        for (int i =1; i <=num ; i++) {
            System.out.print(firstTerm+ " ");
            int thirdTerm = firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =s.nextInt();
        printFibonacciSeries(num);
        s.close();
    }
}
