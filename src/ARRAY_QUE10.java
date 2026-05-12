import java.util.Arrays;

//Copy one array into another array.
public class ARRAY_QUE10 {
    static int[] copyArray(int[] a){
        int newSize=a.length;
        int[] copyArray=new int[newSize];
        for (int i = 0; i < a.length ; i++) {
            copyArray[i]=a[i];
        }
        return copyArray;
    }

    static void main(String[] args) {
        int[] b={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Original Array :");
        for (int i = 0; i < b.length ; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("Copy array :");
        System.out.print(Arrays.toString(copyArray(b)));
    }
}
