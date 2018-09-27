package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 5, 8, 2, 3, 6, 8, 2, 4, 6, 9, 5, 2, 1, 7, 7, 4, 5, 9, 0, 1};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue()); 
        }
        
    }
    
}
