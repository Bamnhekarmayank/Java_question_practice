import java.util.Scanner;

// GCD/HCF of two numbers find karo.
public class que19 {
    static int hcfOfaNumber(int num1, int num2) {
        int hcf = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) { //--> min number tk loop chlega
            if (num1 % i == 0 && num2 % i == 0) //--> dono same number se divide hone chahiye
                hcf = i; //--> greatest number isme aayega jo numbers ko divide kr rha h
        }
        return hcf;
    }

    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        System.out.println(hcfOfaNumber(number1,number2));


    }
}
