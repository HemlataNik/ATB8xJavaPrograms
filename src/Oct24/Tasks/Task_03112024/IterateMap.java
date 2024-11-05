package Oct24.Tasks.Task_03112024;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
