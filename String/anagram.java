import java.util.Arrays;

public class anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;  // Anagrams must have equal length

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));  // Output: false
    }
}
