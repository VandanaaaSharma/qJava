import java.util.Arrays;

public class diff {
    public static int[] pairdiff(int arr[], int n, int diff) {
        Arrays.sort(arr); // Sorting in ascending order

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] == diff) { // Check difference condition
                    return new int[]{arr[i], arr[j]}; // Return the pair
                }
            }
        }
        return new int[]{-1, -1}; // Return {-1, -1} if no pair found
    }

    public static void main(String[] args) {
        int[] arr = {5, 20, 3, 2, 50, 80};
        int diff = 78;
        int n = arr.length;
        System.out.println(Arrays.toString(pairdiff(arr, n, diff)));
    }
}
