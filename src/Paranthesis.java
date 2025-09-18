import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        // If the length of the string is odd, it cannot be valid
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // Push open brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // When encountering a closing bracket, check if it matches the top of the stack
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            // If it doesn't match or the stack is empty, return false
            else {
                return false;
            }
        }

        // In the end, the stack should be empty if all brackets are valid
        return stack.isEmpty();
    }
}
