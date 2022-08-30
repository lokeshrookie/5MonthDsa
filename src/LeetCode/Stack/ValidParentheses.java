package LeetCode.Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Character[] characters = {'{', '}', '[', ']'};
        Stack<Character> stack   = new Stack<>();
        for (Character character : characters) {
            stack.push(character);
        }
        System.out.println(stack);
    }
}
