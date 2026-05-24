// Find the missing number in an array containing numbers from 1 to N
public class ARRAY_QUE19 {
    static int missingNumber(int[] a,int n){
        int expectedSum=(n*(n+1))/2;
        int actualSum=0;
        for(int num:a){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }

    static void main(String[] args) {
        int[] a ={1,2,3,5};
        int n=5;
        System.out.println("Missing Number is : "+missingNumber(a,n));
    }
}
