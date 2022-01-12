package implementations;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * IMPORTANT METHODS OF STACK: Push, Pop, peek , search , empty = returns item argument.
 *
 * pop(),peek() - throws EmptyStack exception if the stack is empty.
 * search() - returns -1 if the element is not found.
 *
 * OTHER METHODS INCLUDE: set(index, element);
 *
 *
 */

public class stackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.size());
        System.out.println(stack.size());
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.toString());
        System.out.println(Arrays.toString(stack.toArray()));

    }

}
