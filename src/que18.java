import java.util.Scanner;

// Armstrong number check karo.
//Example: 153
//1^3+5^3+3^3==153 then only Armstrong number
public class que18 {
    static void checkArmstrongNumber(int num){
        int original = num;
        int temp= num;
         int armSum=0;
         int count=0;
         while(temp>0){ //-->
             temp/=10;
             count++;
         }
         while(num>0){
             int lastDigit= num%10; //--> last digit nikal rhe h
             num/=10; //--> number chota kr rhe h
             armSum=armSum+(int)Math.pow(lastDigit,count); //-- digits k power k sath unka sum
         }
         if (original==armSum) System.out.println(original+" "+"It is a Armstrong Number");
         else System.out.println(original+" "+"It is not a Armstrong Number");
     }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number :");
        int number = s.nextInt();
        checkArmstrongNumber(number);

    }
}
