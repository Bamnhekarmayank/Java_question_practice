public class halfpyramidnumbers {
    static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=i;j++){//-> rows
                System.out.print(j); //-> numbers
            }
            System.out.println();
        }


    }
}
