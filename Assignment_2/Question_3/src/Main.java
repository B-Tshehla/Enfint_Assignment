import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaration
        Scanner intInput = new Scanner(System.in);
        Integer[] numSet1 = {1,2,3,4,5};
        Integer[] numSet2 = {6,7,8,9};
        LinkedList<Integer> linkNum = new LinkedList<>();
        ArrayList<Integer> firstCollection = new ArrayList<>(Arrays.asList(numSet1));
        ArrayList<Integer> secondCollection = new ArrayList<>(Arrays.asList(numSet2));
        int value;
        //Print first collection initial state
        System.out.print("First collection: ");
        for (Integer integer : firstCollection) {
            System.out.print(integer + ",");
        }
        //Print second collection state
        System.out.print("\nSecond collection: ");
        for (Integer integer : secondCollection) {
            System.out.print(integer + ",");
        }

        //User input for element index
        System.out.print("\nElement value not its index!: ");
        value = intInput.nextInt();

        //Append second collection at the given index
        for (Integer integer : firstCollection) {
            if (integer == value) {
                linkNum.add(integer);
                linkNum.addAll(secondCollection);
            } else {
                linkNum.add(integer);
            }
        }
        //Print Results
        System.out.print("Result: ");
        for(Integer integer : linkNum){
            System.out.print(integer+",");
        }



    }
}