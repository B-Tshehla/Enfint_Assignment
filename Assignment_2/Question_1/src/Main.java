import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating hash map
        Map<Integer, String> numMap = new HashMap<>();
        Set<Integer> randSet = new HashSet<>();
        Random rand = new Random();
        String[] oder = {"First","Second","Third","Fourth","Fifth"};
        int smallest = 99999;
        Integer key;
        int x = 0;

        while (randSet.size() < 5){
            randSet.add(rand.nextInt(20));
        }
        // Adding five value pairs
        for (Integer num : randSet){
            numMap.put(num, oder[x]);
            x++;
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