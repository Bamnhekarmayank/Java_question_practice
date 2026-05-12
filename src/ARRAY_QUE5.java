// Count even and odd numbers in an array.
public class ARRAY_QUE5 {
    static void evenOddNumbers(int[] a){
        int oddCount=0,evenCount=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("TOTAL EVEN NUMBERS :"+evenCount);
        System.out.println("TOTAL ODD NUMBERS :"+oddCount);
    }

    static void main(String[] args) {
        int[] a ={10,2,0,4,507,609};
        evenOddNumbers(a);
    }
}
