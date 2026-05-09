public class decimalToBinary {
    static void decimalToBinaryConversion(int deciNumber) {
        String binary="";
        while (deciNumber > 0) {
            int rem = deciNumber % 2;
            binary=rem+binary; //=> reverse remainder is handling
            deciNumber/=2;
        }
        System.out.println(binary);
    }
    static void main(String[] args) {
        decimalToBinaryConversion(13);
    }
}
