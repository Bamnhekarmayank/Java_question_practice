import java.util.*;
//4. 3 numbers me largest find karo.
public class que4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        byte n1 = sc.nextByte();
        byte n2 = sc.nextByte();
        byte n3 = sc.nextByte();
        if(n1>n2 && n1>n3) System.out.println(n3 + " "+ "IS greater among all nums ");
        else if (n2>n1 && n2>n3) System.out.println(n3 + " "+ "IS greater among all nums ");


    }
}
