//
public class ARRAY_QUE21 {
    public static boolean isPresentInArray(int[] array, int size, int value) {

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    // function to check if value exists in second array
    public static boolean existsInSecondArray(int[] secondArray, int value) {

        for (int i = 0; i < secondArray.length; i++) {
            if (secondArray[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 4,};
        int[] secondArray = {3, 4, 5, 6};

        int[] intersectionResult = new int[Math.min(firstArray.length, secondArray.length)];
        int resultSize = 0;

        for (int i = 0; i < firstArray.length; i++) {

            int currentElement = firstArray[i];

            // check if element exists in second array
            if (existsInSecondArray(secondArray, currentElement)) {

                // avoid duplicates in result
                if (!isPresentInArray(intersectionResult, resultSize, currentElement)) {
                    intersectionResult[resultSize++] = currentElement;
                }
            }
        }

        // print result
        System.out.print("Intersection of arrays: ");
        for (int i = 0; i < resultSize; i++) {
            System.out.print(intersectionResult[i] + " ");
        }
    }
}
