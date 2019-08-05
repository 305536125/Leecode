import org.junit.Test;

import java.util.Stack;

public class ValidParentheses {
    @Test
    public void test() {
        System.out.println("0123456".substring(1, 3));
        System.out.println("0123456".indexOf("3"));
        System.out.println(isValid2("([)"));
    }

    public boolean isValidBast(String s) {

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        if (s.length() == 0 || null == s)
            return true;
        Stack<Integer> strings = new Stack<>();
        String[] sarray = s.split("");
        for (String s1 : sarray) {
            Integer val = 0;
            switch (s1) {
                case "(":
                    val = 1;
                    break;
                case ")":
                    val = -1;
                    break;
                case "[":
                    val = 2;
                    break;
                case "]":
                    val = -2;
                    break;
                case "{":
                    val = 3;
                    break;
                case "}":
                    val = -3;
                    break;
            }
            if (strings.empty()) {
                strings.push(val);
            } else {
                if (val + strings.peek() == 0) {
                    strings.pop();
                } else {
                    strings.push(val);
                }
            }
        }
        return strings.empty();
    }

    public boolean isValid(String s) {
        s = s.replace("(", ")");
        s = s.replace("[", "]");
        s = s.replace("{", "}");
        while (s.length() != 0 && null != s) {
            String part = s.substring(0, s.substring(1).indexOf(s.substring(0, 1)) + 2);
            if (part.equals(new StringBuilder(part).reverse().toString())) {
                s = s.substring(s.indexOf(s.substring(0, 1)));
            } else {

                return false;
            }
        }
        return true;
    }
}
