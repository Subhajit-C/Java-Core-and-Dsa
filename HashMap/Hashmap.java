package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class Hashmap {
    public static void main(String[] args) {
        //country(key) , pupulation(value)
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 30);
        
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);


        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Russia"));

        System.out.println(map.containsValue(120));
        System.out.println(map.containsValue(140));

  
        System.out.println(map.get("India"));
        System.out.println(map.get("Korea"));



        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.print(e.getKey() + " : ");
            System.out.print(e.getValue());
            System.out.println();
            System.out.println(e);
        }


        System.out.println("2nd approach to iterate:");
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }


        System.out.println(map.remove("China"));
        System.out.println(map);


        System.out.println(map.size());
    }
}
