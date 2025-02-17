import java.util.Stack;

public class parenthesis {
    public static boolean valid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                char top = s.peek();
                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(){}[]";
        System.out.println(valid(str));  // Output: true
    }
}
