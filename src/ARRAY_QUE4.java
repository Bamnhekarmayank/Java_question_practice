// Find the minimum element in an array.
public class ARRAY_QUE4 {
    static int minElement(int[] a){
        int min =Integer.MAX_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }

    static void main(String[] args) {
        int[] a ={100,20,30,40,50};
        System.out.println(minElement(a));
    }
}
