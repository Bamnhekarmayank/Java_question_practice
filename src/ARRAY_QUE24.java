import java.util.Arrays;

// Find the longest consecutive sequence in an array.
public class ARRAY_QUE24 {
    static void longestConsecutiveSubsequence(int[] n) {
        if (n.length == 0) {
            System.out.println(0);
            return;
        }
        Arrays.sort(n);
        int longest = 1; //-> isme hum longest sunseq ka size store krenge
        int current = 1; //-> isme hum current subseq ka size store krnege
        for (int i = 1; i < n.length; i++) {
            //ignore duplicates
            if (n[i] == n[i - 1]) {
                continue;
            }
            if (n[i] == n[i - 1]+1){
                current++;
            }
            else {
                longest=Math.max(longest,current);
                current=1;
            }
        }
        longest=Math.max(longest,current);
        System.out.println("Longest conseq : "+longest);
    }

    static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        longestConsecutiveSubsequence(arr);
    }
}
