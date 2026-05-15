import java.util.Arrays;

//Right rotate an array by one position.
public class ARRAY_QUE16 {
    static int[] rightRotateByOne(int[] n){
        int last=n[n.length-1];
        for (int i = n.length-1; i >0 ; i--) {
            n[i]=n[i-1];
        }
        n[0]=last;
        return n;
    }

    static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Old array :"+Arrays.toString(arr));
        rightRotateByOne(arr);
        System.out.print("New array :"+Arrays.toString(arr));


    }
}
