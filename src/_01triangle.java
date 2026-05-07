public class _01triangle {
    static void main(String[] args) {
        int n=5;
        for (int i = 1; i<=n ; i++) {
            for (int j =1;j<=i;j++){
                // even h to 1 print (i+j)
                if((i+j)%2==0) System.out.print(1);
                // odd h to print 0 (i+j)
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
