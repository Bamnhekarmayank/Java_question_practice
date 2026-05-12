import java.util.*;
// Print all elements of an array
//public class ARRAY_QUE1 {
//    static void printElements() {
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter size of array :");
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = s.nextInt();
//        }
//        for (int i = 0; i <n ; i++) {
//            System.out.print(+arr[i]+" ");
//        }
//    }
//    static void main(String[] args) {
//        printElements();
//    }
//}
import java.util.*;

public class ARRAY_QUE1 {

    static void printElements() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        printElements();
    }
}