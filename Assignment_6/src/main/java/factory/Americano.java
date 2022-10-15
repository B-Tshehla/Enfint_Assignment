package factory;

public class Americano implements Coffee{
    @Override
    public void createCoffee() {
        System.out.println("Creating an americano coffee");
    }
}
