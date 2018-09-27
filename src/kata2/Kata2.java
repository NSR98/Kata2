package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1, 5, 8, 2, 3, 6, 8, 2, 4, 6, 9, 5, 2, 1, 7, 7, 4, 5, 9, 0, 1};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();

        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue()); 
        }
        
    }
    
}
