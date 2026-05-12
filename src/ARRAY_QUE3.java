//Find the maximum element in an array
public class ARRAY_QUE3 {
    static int maxElement(int[] a){
        int max =Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }

    static void main(String[] args) {
        int[] a ={100,20,30,40,50};
        System.out.println(maxElement(a));
    }
}
