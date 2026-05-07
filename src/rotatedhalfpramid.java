public class rotatedhalfpramid {
    static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=n-i;j++){ //-> space print
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"); // -> stars print
            }
            System.out.println();
        }
    }
}
