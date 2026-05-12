// Print array elements at even indexes.
public class ARRAY_QUE9 {
    static void evenIndicesElements(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            System.out.print(a[i] + " ");

        }
    }

    static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        evenIndicesElements(a);
    }
}
