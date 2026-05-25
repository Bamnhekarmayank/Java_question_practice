//Find all pairs whose sum equals a given number
public class ARRAY_QUE23 {
    static void findPairs(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println("(" + a[i] + "," + a[j] + ")");
                }
            }
        }
    }
    static void main(String[] args) {
        int arr[] = {1, 5, 7, -1, 5};
        int target = 6;
        findPairs(arr, target);
    }
}
