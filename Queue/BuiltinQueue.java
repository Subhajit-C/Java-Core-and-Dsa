package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BuiltinQueue {
    public static void main(String[] args) {
        // Queue <Integer> queue = new Queue<>();
        // this will give an error since queue is an interface. stack is a class

        Queue <Integer> queue = new LinkedList<>();

        //adding element into queue
        queue.add(34);
        queue.add(3);
        queue.add(76);
        queue.add(14);
        queue.add(45);
        queue.add(27);

        System.out.println(queue);

        //returns the 1st item in the queue
        System.out.println(queue.peek());

        //returns the first element and also removes that element from the queue
        System.out.println(queue.remove());

        System.out.println(queue);

        //return true if item present in the queue and removes the element
        //return false if item not present and
        System.out.println(queue.remove(14));
        System.out.println(queue.remove(24));

        System.out.println(queue);
    }    
}
