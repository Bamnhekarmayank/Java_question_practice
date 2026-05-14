//Find duplicate elements in an array
public class ARRAY_QUE13 {
    static void findDuplicateElements(int[] n) {
        if (n.length < 1) {
            return;
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    System.out.println(n[i]);
                }
            }
        }
    }

    static void main(String[] args) {
        int[] array = {10, 10, 20, 30, 40, 50, 60, 60};
        findDuplicateElements(array);
    }
}
