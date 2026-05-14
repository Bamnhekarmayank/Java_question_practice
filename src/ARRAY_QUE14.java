//Count frequency of each element in an array
public class ARRAY_QUE14 {

    static void countFrequency(int[] arr) {

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};

        countFrequency(arr);
    }
}