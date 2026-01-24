package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BuiltinDequeue {
    public static void main(String[] args) {
        Deque <Integer> deque = new ArrayDeque<>();

        deque.add(77); 
        deque.add(44);      
        deque.addFirst(1);          
        deque.addLast(5);

        System.out.println(deque);

        deque.removeFirst();  
        //removes the first element in the deque

        System.out.println(deque);
    }
}
