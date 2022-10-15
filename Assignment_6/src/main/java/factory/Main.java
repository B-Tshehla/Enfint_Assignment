package factory;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        System.out.print("Create Americano: ");
        Coffee americano = coffeeFactory.createACoffee("americano");
        americano.createCoffee();

        System.out.print("Create Espresso: ");
        Coffee espresso = coffeeFactory.createACoffee("ESPRESSO");
        espresso.createCoffee();
    }
}