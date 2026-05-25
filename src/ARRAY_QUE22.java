// Find the largest sum contiguous subarray using Kadane’s Algorithm.
public class ARRAY_QUE22 {
    static void largestSumSubarray(int[] n) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for (int i = 0; i < n.length; i++) {
            currentSum += n[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i; //--> agr sum positve chal rha h starting se to end ko i assign krdenge
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;//-> agr sum -ve ho to hum temp ko i=1 assign kr denge so new start
            }
        }
        System.out.println("Max sum=" + maxSum);
        System.out.print("Sub array =" + ' ');
        for (int i = start; i <= end; i++) {
            System.out.print(n[i] + " ");
        }
    }
    static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        largestSumSubarray(arr);
    }
}
