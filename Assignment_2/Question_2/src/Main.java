import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Method replaces an element in the ArrayList
    public static void replaceElement(ArrayList<String> favFood, int index,String value){
        favFood.set(index,value);
    }

    public static void main(String[] args) {
        //Declaration
        String[] food = {"Pizza","Hamburger","HotDog","Kota","Fries"};
        ArrayList<String> favFood = new ArrayList<>(Arrays.asList(food));
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        int count = 0;
        int element;
        String itemName;

        try {
            System.out.println("This is a list of your favourite food:");
            for (String s : food) {
                count++;
                System.out.println(count+" "+s);
            }

            System.out.println("Enter the number of the food item you want to replace:");
            element=intInput.nextInt();
            System.out.println("Enter the name of the food item you want to replace it with:");
            itemName =stringInput.nextLine();

            replaceElement(favFood,element-1,itemName);
            System.out.println(favFood);
        }catch (IndexOutOfBoundsException i){
                System.out.println("Your element index is out of bounce");
        }catch (InputMismatchException i){
            System.out.println("You entered characters while an integer was expected");
        }



    }
}