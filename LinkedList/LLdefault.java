import java.util.LinkedList;

public class LLdefault {

    
    public static void main(String[] args) {
        //internal linked list provided by java
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        System.out.println(list);
        System.out.println(list.get(3));
    
    }
}
