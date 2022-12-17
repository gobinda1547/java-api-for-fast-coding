
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("gobinda", 20000);
        map.put("sourav", 25000);
        map.put("shamim", 30000);
        
        
        System.out.println("map = " + map);
        System.out.println();
        
        
        System.out.println("Is key(joy) exist -> " + map.containsKey("joy"));
        System.out.println("Is key(gobinda) exist -> " + map.containsKey("gobinda"));
        System.out.println();
        
        
        System.out.println("Is value(30000) exist -> " + map.containsValue(30000));
        System.out.println("Is value(10000) exist -> " + map.containsValue(10000));
        System.out.println();
        
        
        System.out.println("Getting item -> " + map.get("gobinda"));
        System.out.println("Getting item -> " + map.get("joy"));
        System.out.println();
        
        
        System.out.println("isEmpty = " + map.isEmpty());
        System.out.println();
        
    
        System.out.println("size = " + map.size());
        System.out.println();
        
    }
    
}
