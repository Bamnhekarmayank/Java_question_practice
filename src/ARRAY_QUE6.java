import java.util.Arrays;

// Reverse an array.
public class ARRAY_QUE6 {
    static int[] reverseArray(int[] a) {
        int newSize = a.length;
        int indexCounter=0;
        int[] newArray = new int[newSize];
        for (int i = a.length-1; i >=0 ; i--) {
             newArray[indexCounter]=a[i];
             indexCounter++;
        }
        return newArray;
    }

    static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Reverse array:"+ Arrays.toString(reverseArray(a)));
    }
}
