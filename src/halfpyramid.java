public class halfpyramid {
    static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=i;j++){ //-> jitne i ki value utne stars print uss row me
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
