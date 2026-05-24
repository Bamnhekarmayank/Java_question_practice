// Find union of two arrays.
public class ARRAY_QUE20 {
    // function to check if element already exists in result array
    public static boolean isAlreadyPresent(int[] resultArray, int currentSize, int valueToCheck) {

        for (int index = 0; index < currentSize; index++) {
            if (resultArray[index] == valueToCheck) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // First input array
        int[] firstArray = {1, 2, 3, 4};

        // Second input array
        int[] secondArray = {3, 4, 5, 6};

        // Result array (max possible size = both arrays combined)
        int[] unionResult = new int[firstArray.length + secondArray.length];

        // keeps track of how many elements we have inserted in result
        int resultSize = 0;

        // Step 1: Add elements of first array
        for (int i = 0; i < firstArray.length; i++) {

            int currentElement = firstArray[i];

            if (!isAlreadyPresent(unionResult, resultSize, currentElement)) {
                unionResult[resultSize] = currentElement;
                resultSize++;
            }
        }

        // Step 2: Add elements of second array
        for (int i = 0; i < secondArray.length; i++) {

            int currentElement = secondArray[i];

            if (!isAlreadyPresent(unionResult, resultSize, currentElement)) {
                unionResult[resultSize] = currentElement;
                resultSize++;
            }
        }

        // Step 3: Print final union
        System.out.print("Union of arrays is: ");
        for (int i = 0; i < resultSize; i++) {
            System.out.print(unionResult[i] + " ");
        }
    }
}
