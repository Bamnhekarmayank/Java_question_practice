public class inverthalfpyramid {
    static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >= i; j--) { //-> jitne i ki value utne stars print uss row me
                System.out.print("*");
            }
            System.out.println();
        }
    }
 // i--> 1to 4
    // j --> 4 to i

}
