import java.util.Arrays;

public class Selection_sort {
    static void selectionSort(int[] arr){
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int minIndex=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            //Swap
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    static void main(String[] args) {
        int[] arr ={4,5,1,3,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
