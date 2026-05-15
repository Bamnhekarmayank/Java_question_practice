import java.util.Arrays;

// Check whether an array is palindrome or not.
public class ARRAY_QUE18 {
    static boolean checkPalindrome(int[] a) {
        int newSize = a.length;
        int indexCounter=0;
        int[] newArray = new int[newSize];
        for (int i = a.length-1; i >=0 ; i--) {
            newArray[indexCounter]=a[i];
            indexCounter++;
        }
        return (Arrays.equals(a,newArray));
    }

    static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        if (checkPalindrome(a)){
            System.out.println("It is a palindrome");
        }else System.out.println("It is not a palindrome");

    }

}
