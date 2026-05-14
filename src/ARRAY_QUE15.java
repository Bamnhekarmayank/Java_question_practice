import java.util.Arrays;

// Left rotate by one an array by one position. 1ST ELE KO LAST ME KR DO
public class ARRAY_QUE15 {
    static int[] leftRotate(int[] arr){
        int first=arr[0];
        for (int i = 0; i < arr.length -1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        return arr;
    }

    static void main(String[] args) {
        int[] n={10,20,30,40,50};
        System.out.println(Arrays.toString(leftRotate(n)));
    }
}
