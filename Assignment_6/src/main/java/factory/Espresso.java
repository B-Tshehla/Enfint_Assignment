package factory;

public class Espresso implements Coffee {

    @Override
    public void createCoffee() {
        System.out.println("Creating an espresso coffee");
    }
}
