public class strong_number {

    // ek digit ka factorial
    static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static void strongNumber(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + factorial(lastDigit); // each number fact
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }

    public static void main(String[] args) {
        strongNumber(40585);
    }
}