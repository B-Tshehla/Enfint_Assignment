import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Creating hash map
        Map<Integer, String> numMap = new HashMap<>();
        Random rand = new Random();
        String[] oder = {"First","Second","Third","Fourth","Fifth"};
        int smallest = 99999;
        Integer key;
        String value;

        for (int x = 0; x < 5;++x){
            numMap.put(rand.nextInt(20),oder[x]);
        }

        System.out.println(numMap);
        // Iterating through forEach and
        // printing the elements
        for (Map.Entry<Integer, String> entry : numMap.entrySet()) {
             key = entry.getKey();
             value = entry.getValue();
             if (key < smallest){
                 smallest = key;
             }
            System.out.println(key + " = " + value);
        }

        System.out.println(numMap.get(smallest));

        numMap.remove(smallest);

        System.out.println(numMap);
    }
}