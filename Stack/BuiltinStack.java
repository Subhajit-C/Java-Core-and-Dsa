package Stack;

import java.util.Stack;

public class BuiltinStack {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>(); 
        stack.push(34);
        stack.push(23);
        stack.push(78);
        stack.push(45);

        
        System.out.println(stack);
        
        //pop() returns an item and also updates the stack. ie remove that item 
        System.out.println(stack.pop());     //45 removed
        System.out.println(stack.pop());     //78 removed
        System.out.println("After removing 2 elements: " + stack);
        System.out.println(stack.peek());

    }
}
