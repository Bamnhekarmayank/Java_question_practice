public class Implement_Merge_Sort {

    static void conquer(int[] arr, int startIndex, int mid, int endIndex) {

        int[] merge = new int[endIndex - startIndex + 1];

        int idx1 = startIndex;
        int idx2 = mid + 1;

        int x = 0;

        // Merge both halves
        while (idx1 <= mid && idx2 <= endIndex) {

            if (arr[idx1] <= arr[idx2]) {

                merge[x++] = arr[idx1++];
            }
            else {

                merge[x++] = arr[idx2++];
            }
        }

        // Remaining left half
        while (idx1 <= mid) {

            merge[x++] = arr[idx1++];
        }

        // Remaining right half
        while (idx2 <= endIndex) {

            merge[x++] = arr[idx2++];
        }

        // Copy back to original array
        for (int i = 0, j = startIndex; i < merge.length; i++, j++) {

            arr[j] = merge[i];
        }
    }

    static void divide(int[] arr, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {

            return;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;

        divide(arr, startIndex, mid);

        divide(arr, mid + 1, endIndex);

        conquer(arr, startIndex, mid, endIndex);
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 0, 44, 1, 8, 9, 30, 7, 40, 55, 65, 1};

        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {

            System.out.print(num + " ");
        }
    }
}