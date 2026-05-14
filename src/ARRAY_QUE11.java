// Find the second largest element in an array.
public class ARRAY_QUE11 {
    static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // all elements same
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        System.out.println("Second Largest: " + secondLargest(arr));
    }
}