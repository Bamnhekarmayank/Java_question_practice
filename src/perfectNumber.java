// Perfect number check karo
//Example: 28
//Aisa number jiske proper divisors (khud number ko छोड़कर jo numbers perfectly divide karein) ka sum us number ke equal ho.
public class perfectNumber {
    static void checkForPerfectNumber(int num){
        int sum=0;
        for (int i = 1; i <num ; i++) { //
            if(num%i==0){
                sum+=i;
            }
        }
        if (sum==num) System.out.println("Yes it is a perfectNumber");
        else System.out.println("Yes it is not a perfectNumber");
    }
    static void main(String[] args) {
        checkForPerfectNumber(2);

    }
}
