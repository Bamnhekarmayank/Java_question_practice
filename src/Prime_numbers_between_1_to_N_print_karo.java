public class Prime_numbers_between_1_to_N_print_karo {
    static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int testNumber = 13;
        int sum=0;

        for (int i = 2; i <= testNumber; i++) {
            if (isPrime(i)) {
               // System.out.print(i + " ");
                sum+=i;
            }
        }
        System.out.println("All prime number sum is upto N"+" "+sum);
    }
}

