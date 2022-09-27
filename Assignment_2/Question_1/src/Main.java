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

        // Adding five value pairs
        for (int x = 0; x < 5;++x){
            int num =rand.nextInt(20)+1;
            System.out.println(num);
            numMap.put(num,oder[x]);
        }
        //Printing the entire Hashmap
        System.out.println(numMap);

        //Iterating through the Hashmap to find the smallest key
        for (Map.Entry<Integer, String> entry : numMap.entrySet()) {
             key = entry.getKey();
             if (key < smallest) {
                 smallest = key;
             }
        }
        //printing The smallest value pair
        System.out.println("The value pair with the smallest key:("+smallest+" = "+numMap.get(smallest)+")");

        //Removing the smallest value pair from the list
        numMap.remove(smallest);

        //Printing the entire Hashmap
        System.out.println(numMap);
    }
}