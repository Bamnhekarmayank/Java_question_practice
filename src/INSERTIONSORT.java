import java.util.Arrays;

public class INSERTIONSORT {
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            // shifting bigger elements
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // inserting elements
            arr[prev + 1] = current;
        }
    }

    static void main(String[] args) {
        int[] arr ={4,1,5,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}