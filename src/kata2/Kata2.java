package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 5, 8, 2, 3, 6, 8, 2, 4, 6, 9, 5, 2, 1, 7, 7, 4, 5, 9, 0, 1};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i]) == false){
                histogram.put(data[i], 1);
            }else {
                histogram.put(data[i], histogram.get(data[i])+1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue()); 
        }
        
    }
    
}
