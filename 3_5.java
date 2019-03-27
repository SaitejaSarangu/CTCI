package chap03;

import static helpers.Printer.*;

import java.util.Arrays;
import java.util.Stack;

/*
	small items on top of stack
*/
public class Q6 {
 
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> result = new Stack<Integer>();
        while (!stack.isEmpty() ) {
            int item = stack.pop();
            while (!result.isEmpty() && item > result.peek()) {
                stack.push(result.pop());
            }
            result.push(item);
        }
        return result;
    }

    //TEST
    public static void main(String[] args) {
        Integer[] a = {2,6,5,4,1,3,8,7};
        Stack<Integer> stack = new Stack<Integer>();
        stack.addAll(Arrays.asList(a));
        print(sortStack(stack));
    }
}
