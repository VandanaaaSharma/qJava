// searching in an array where adjacent differ by atmost k
public class search {
    public static int search(int[] arr, int n, int x, int k) {
        int i = 0;
        while (i < n) {
            if (arr[i] == x) {
                return i; // Element found, return index
            }
            // Calculate the step size
            int step = Math.max(1, Math.abs(arr[i] - x) / k);
            i += step; // Move to the next possible index
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 6};
        int k = 1, x = 6;
        int n = arr.length;

        int index = search(arr, n, x, k);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}

