import java.util.*;

public class permute {
    public static boolean pair(Integer a[], Integer b[], int k, int n) {
        Arrays.sort(a, Collections.reverseOrder()); // Sorting array 'a' in descending order
        Arrays.sort(b); // Sorting array 'b' in ascending order
        
        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) { // If any pair sum is less than k, return false
                return false;
            }
        }
        return true; // If all pairs satisfy the condition, return true
    }

    public static void main(String[] args) {
        Integer a[] = {2, 1, 3}; // Integer array for sorting in reverse order
        Integer b[] = {7, 8, 9};
        int k = 10;
        int n = a.length;
        System.out.println(pair(a, b, k, n));
    }
}
