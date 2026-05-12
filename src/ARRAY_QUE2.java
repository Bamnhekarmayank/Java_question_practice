// Find the sum of all elements in an array.
public class ARRAY_QUE2 {
    static int sumOfAllElements(int[] a) {
        int sum=0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        System.out.println(sumOfAllElements(a));
    }
}
