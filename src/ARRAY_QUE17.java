import java.util.Arrays;

//Move all zeros to the end of the array.
public class ARRAY_QUE17 {
    static int[] movesAllZeroesToEnd(int[] arr){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            if (arr[j]==0){
                j--;
            } else if (arr[i]!=0) {
                i++;
            }else{
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return arr;
    }

    static void main(String[] args) {
        int[] arr ={10,0,20,0,40,50,0,0,0,80};

        System.out.println(Arrays.toString(movesAllZeroesToEnd(arr)));
    }
}
//to maintain the order
//static int[] moveZeros(int[] arr){
//    int j = 0;
//
//    for(int i = 0; i < arr.length; i++){
//        if(arr[i] != 0){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            j++;
//        }
//    }
//    return arr;
//}