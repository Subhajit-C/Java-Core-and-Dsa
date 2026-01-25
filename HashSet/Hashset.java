package HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); 

        //Add 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(6);

        System.out.println(set);

        //Search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("set does not contains 6");
        }


        //Delete
        set.remove(1);
        System.out.println(set.remove(1)); 

        System.out.println(""+set.size());
        System.out.println(set);


        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
         
    }
}
