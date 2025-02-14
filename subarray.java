import java.util.Arrays;

public class subarray {
    public static void maxSubarray(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        // Prefix Sum Array
        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        // Finding Maximum Subarray Sum
        for (int i = 0; i < num.length; i++) {  // Start index
            int start = i;
            for (int j = i; j < num.length; j++) {  // End index
                int end = j;
                
                // Calculate subarray sum using prefix sum
                currsum = (start == 0) ? prefix[end] : (prefix[end] - prefix[start - 1]);
                
                // Update max sum
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxsum);
    }

    public static void main(String[] args) {
        int num[] = {1, -2, 6, -1, 3};  // Define the array
        maxSubarray(num);
    }
}
