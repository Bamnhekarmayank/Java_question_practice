import java.util.Scanner;

// Search an element in an array or return -1 if not found
public class ARRAY_QUE7 {
    static int searchElement(int[] a,int key){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] a={10,20,30,40,50,60,70,80,90,10};
        System.out.print("Enter element to search:");
        int key= sc.nextInt();
        System.out.println("Element is at index :"+searchElement(a,key));
    }
}
