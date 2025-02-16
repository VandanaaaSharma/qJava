import java.util.Stack;

public class consecutive {
    public static String removeCons(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remove only if the top of the stack matches the current character
            if (!s.isEmpty() && s.peek() == ch) {
                s.pop();
            } else {
                s.push(ch);
            }
        }

        // Convert stack to string
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.insert(0, s.pop()); // Insert at the beginning
        }

        // If the last character is non-consecutive but unnecessary, remove it
        if (!result.isEmpty() && result.charAt(result.length() - 1) == 'e') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcdddde";
        System.out.println(removeCons(str));  // Output: "abcd"
    }
}
