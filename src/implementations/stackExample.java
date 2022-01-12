package implementations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * IMPORTANT METHODS OF STACK: Push, Pop, peek , search , empty, size()  = returns item argument.
 *
 * pop(),peek() - throws EmptyStack exception if the stack is empty.
 * search() - returns -1 if the element is not found.
 *
 * OTHER METHODS INCLUDE: set(index, element);
 *                         sort(null) - null is comparator.
 *
 *  ADVANTAGES OF STACK:
 *  1. Maintain data in LIFO manner.
 *  2. Last element is readily available for use.
 *  3. All operations are of O(1) complexity.
 *
 *  DISADVANTAGES:
 *  1. Manipulation is restricted to the top of the stack.
 *  2. Not much flexible.
 *
 *  APPLICATION:
 *  1. undo redo in editors.
 *  2. Browser to store previous tabs.
 *
 *
 *
 *
 */

public class stackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.toString());
        System.out.println(Arrays.toString(stack.toArray()));

        stack.sort(null); // comparator is null.
        System.out.println(stack);


        Iterator<Integer> it = stack.iterator();
        while(it.hasNext()){
            System.out.println(stack.pop());
        }
        System.out.println(stack);

    }

}
