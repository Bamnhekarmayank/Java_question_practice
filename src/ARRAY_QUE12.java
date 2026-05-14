import java.util.Arrays;

// Merge two arrays into a single array.
public class ARRAY_QUE12 {
    static int[] mergeArray(int[] a1, int[] a2) {
        int[] newArray = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            newArray[i] = a1[i];
        }
        for (int i = 0; i <a2.length ; i++) {
            newArray[a1.length+i]=a2[i];
        }
        return newArray;
    }

    static void main(String[] args) {
        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(mergeArray(a1,a2)));
    }
}
