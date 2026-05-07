import java.util.Scanner;

//. LCM of two numbers find karo.
public class que20 {
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
        int number1= s.nextInt();
        int number2= s.nextInt();
        int hcf = hcfOfaNumber(number1,number2);
        int Lcm = (number1*number2)/hcf;
        System.out.println("LCM of number1 and number2 is :"+Lcm);
    }

}
