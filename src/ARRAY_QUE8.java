//Calculate average of array elements
public class ARRAY_QUE8 {
    static float avgOfElements(int[] a) {
        int sum = 0;
        if (a.length==0) return 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
       ;
        return (float) sum / a.length;
    }

    static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70,80,90,100};
        System.out.println(avgOfElements(a));
    }
}
