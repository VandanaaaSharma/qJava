
import java.util.*;
public class max {
    public static void maxAndMin(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print final results
        System.out.println("Maximum: " + maxi);
        System.out.println("Minimum: " + min);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        maxAndMin(arr);
    }
}


