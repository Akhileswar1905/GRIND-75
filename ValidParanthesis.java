import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
        sc.close();
    }

    public static boolean check(char a, char b) {
        if (a == '(' && b == ')') {
            return true;
        }
        if (a == '[' && b == ']') {
            return true;
        }
        if (a == '{' && b == '}') {
            return true;
        }
        return false;

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    if (check(stack.peek(), ch)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
